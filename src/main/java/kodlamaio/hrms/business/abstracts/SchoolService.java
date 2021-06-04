package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Schools;

import java.time.LocalDate;
import java.util.List;

public interface SchoolService {
    Result add(Schools schools);

}
