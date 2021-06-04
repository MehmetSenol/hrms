package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Technologies;

public interface TechnologiesService {
    Result add(Technologies technologies);
}
