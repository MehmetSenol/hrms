package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.TypeOfWorking;

public interface TypeOfWorkingService {
    Result add(TypeOfWorking typeOfWorking);
}
