package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.CandidateJobExperiences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateJobExperiencesDao extends JpaRepository<CandidateJobExperiences,Integer> {
}
