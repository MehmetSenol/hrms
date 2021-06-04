package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CandidateJobExperiencesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CandidateJobExperiencesDao;
import kodlamaio.hrms.entities.concretes.CandidateJobExperiences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateJobExperiencesManager implements CandidateJobExperiencesService {
    private CandidateJobExperiencesDao candidateJobExperiencesDao;

    @Autowired
    public CandidateJobExperiencesManager(CandidateJobExperiencesDao candidateJobExperiencesDao) {
        this.candidateJobExperiencesDao = candidateJobExperiencesDao;
    }

    @Override
    public Result add(CandidateJobExperiences candidateJobExperiences) {
        this.candidateJobExperiencesDao.save(candidateJobExperiences);
        return new SuccessResult("Başarılı Bir Şekilde Eklendi");
    }
}
