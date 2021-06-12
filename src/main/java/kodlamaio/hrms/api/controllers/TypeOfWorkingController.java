package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.TypeOfWorkingService;
import kodlamaio.hrms.core.utilities.Result;

import kodlamaio.hrms.entities.concretes.TypeOfWorking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/typeofworking")
public class TypeOfWorkingController {
    private TypeOfWorkingService typeOfWorkingService;

    @Autowired
    public TypeOfWorkingController(TypeOfWorkingService typeOfWorkingService) {
        this.typeOfWorkingService = typeOfWorkingService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody TypeOfWorking typeOfWorking) {
        return this.typeOfWorkingService.add(typeOfWorking);
    }
}
