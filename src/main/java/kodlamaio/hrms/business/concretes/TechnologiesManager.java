package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.TechnologiesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TechnologiesDao;
import kodlamaio.hrms.entities.concretes.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnologiesManager implements TechnologiesService {
    private TechnologiesDao technologiesDao;

    @Autowired
    public TechnologiesManager(TechnologiesDao technologiesDao) {
        this.technologiesDao = technologiesDao;
    }

    @Override
    public Result add(Technologies technologies) {
        this.technologiesDao.save(technologies);
        return new SuccessResult("Teknoloji Eklendi");
    }
}
