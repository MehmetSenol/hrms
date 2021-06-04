package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.ErrorResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageManager implements LanguageService {
    private LanguageDao languageDao;

    @Autowired
    public LanguageManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public Result add(Languages languages) {
       if (languages.getLanguageLevel()<1 || languages.getLanguageLevel()>5){
           return new ErrorResult("Seviye 1 ile 5 arasında olmalıdır");
       }else{
           this.languageDao.save(languages);
           return new SuccessResult("Başarılı Bir Şekilde Kaydedildi");
       }


    }
}
