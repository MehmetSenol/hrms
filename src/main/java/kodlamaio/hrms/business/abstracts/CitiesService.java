package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.Cities;

import java.util.List;

public interface CitiesService {
    DataResult<List<Cities>> getAll();
}
