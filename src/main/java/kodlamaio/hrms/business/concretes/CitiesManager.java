package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CitiesService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.CitiesDao;
import kodlamaio.hrms.entities.concretes.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitiesManager implements CitiesService {
    private CitiesDao citiesDao;

    @Autowired
    public CitiesManager(CitiesDao citiesDao) {
        this.citiesDao = citiesDao;
    }

    @Override
    public DataResult<List<Cities>> getAll() {
        return new SuccessDataResult<>(this.citiesDao.findAll(),"Listelendi");
    }
}
