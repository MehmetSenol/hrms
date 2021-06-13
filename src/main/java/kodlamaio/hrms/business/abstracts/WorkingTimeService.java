package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.WorkingTime;

import java.util.List;

public interface WorkingTimeService {
    Result add(WorkingTime workingTime);
    DataResult<List<WorkingTime>> getAll();
}
