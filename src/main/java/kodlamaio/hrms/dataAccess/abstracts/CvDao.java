package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CvDao extends JpaRepository<Cv,Integer> {
    List<Cv> getAllBy();
    List<Cv> findByCandidate_Id(int id);

}
