package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.TypeOfWorkingService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.TypeOfWorkingDao;
import kodlamaio.hrms.entities.concretes.TypeOfWorking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeOfWorkingManager implements TypeOfWorkingService {
    private TypeOfWorkingDao typeOfWorkingDao;

    @Autowired
    public TypeOfWorkingManager(TypeOfWorkingDao typeOfWorkingDao) {
        this.typeOfWorkingDao = typeOfWorkingDao;
    }

    @Override
    public Result add(TypeOfWorking typeOfWorking) {
        typeOfWorkingDao.save(typeOfWorking);
        return new SuccessResult("Başarılı Bir Şekilde Eklendi");
    }

    @Override
    public DataResult<List<TypeOfWorking>> getAll() {
        return new SuccessDataResult<>(this.typeOfWorkingDao.findAll(),"Listelendi");
    }
}
