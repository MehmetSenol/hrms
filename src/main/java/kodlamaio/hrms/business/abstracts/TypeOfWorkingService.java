package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.TypeOfWorking;

import java.util.List;

public interface TypeOfWorkingService {
    Result add(TypeOfWorking typeOfWorking);
    DataResult<List<TypeOfWorking>> getAll();
}
