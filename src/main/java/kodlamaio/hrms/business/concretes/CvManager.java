package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.adapters.cloudinary.CloudinaryService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.CvDao;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CvManager implements CvService {
    private CvDao cvDao;
    private CloudinaryService cloudinaryService;

    @Autowired
    public CvManager(CvDao cvDao, CloudinaryService cloudinaryService) {
        this.cvDao = cvDao;
        this.cloudinaryService = cloudinaryService;
    }

    @Override
    public Result add(Cv cv) {
        cvDao.save(cv);
        return new SuccessResult("Başarılı bir Şekilde Sisteme Eklendi");
    }

    @Override
    public DataResult<List<Cv>> getAll() {
        return new SuccessDataResult<>(this.cvDao.getAllBy(),"Listelendi");
    }

    @Override
    public DataResult<List<Cv>> getAllCandidateId(int candiateId) {
        return new SuccessDataResult<List<Cv>>(this.cvDao.findByCandidate_Id(candiateId));
    }

    @Override
    public Result uploadImage(MultipartFile multipartFile, int cvId) {
        try{
            String filePath=this.cloudinaryService.upload(multipartFile).getData().get("url").toString();
            Cv cv=cvDao.getOne(cvId);
            cv.setImage(filePath);
            cvDao.save(cv);
            return new SuccessResult("Yüklendi");

        }catch (IOException e){
            return new ErrorResult("Yüklenirken Bir Hata Oluştu");
        }
    }

    @Override
    public DataResult<List<Cv>> getAllSortedWorkExperience() {
        Sort sort = Sort.by(Sort.Direction.DESC, "candidatesJobExperiences.jobDeparture");
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(sort));

    }

    @Override
    public DataResult<List<Cv>> getAllSortedSchoolExperience() {
        Sort sort = Sort.by(Sort.Direction.DESC, "schools.dateOfGraduation");
        return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(sort));


    }
}
