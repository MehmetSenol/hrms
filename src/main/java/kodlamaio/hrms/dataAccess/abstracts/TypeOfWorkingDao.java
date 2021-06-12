package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.TypeOfWorking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeOfWorkingDao extends JpaRepository<TypeOfWorking,Integer> {
}
