package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CandidateJobExperiences;

public interface CandidateJobExperiencesService {
    Result add(CandidateJobExperiences candidateJobExperiences);
}
