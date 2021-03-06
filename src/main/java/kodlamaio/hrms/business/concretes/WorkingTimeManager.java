package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.WorkingTimeService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.WorkingTimeDao;
import kodlamaio.hrms.entities.concretes.WorkingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkingTimeManager implements WorkingTimeService {
    private WorkingTimeDao workingTimeDao;

    @Autowired
    public WorkingTimeManager(WorkingTimeDao workingTimeDao) {
        this.workingTimeDao = workingTimeDao;
    }

    @Override
    public Result add(WorkingTime workingTime) {
        workingTimeDao.save(workingTime);
        return new SuccessResult("Başarılı Bir Şekilde Eklendi");
    }

    @Override
    public DataResult<List<WorkingTime>> getAll() {
        return new SuccessDataResult<>(this.workingTimeDao.findAll(),"Listelendi");
    }
}
