package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Languages;

public interface LanguageService {
    Result add(Languages languages);
}
