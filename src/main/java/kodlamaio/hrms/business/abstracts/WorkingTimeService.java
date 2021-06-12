package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.WorkingTime;

public interface WorkingTimeService {
    Result add(WorkingTime workingTime);
}
