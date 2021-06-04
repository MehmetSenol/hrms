package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface CvService {
    Result add(Cv cv);
    DataResult<List<Cv>> getAll();
    DataResult<List<Cv>> getAllCandidateId(int candidateId);

    Result uploadImage(MultipartFile multipartFile,int cvId);
    DataResult<List<Cv>> getAllSortedWorkExperience();
    DataResult<List<Cv>> getAllSortedSchoolExperience();




}
