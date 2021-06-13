package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.TechnologiesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/technologies")
public class TechnologiesController {
    private TechnologiesService technologiesService;

    @Autowired
    public TechnologiesController(TechnologiesService technologiesService) {
        this.technologiesService = technologiesService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody Technologies technologies) {
        return this.technologiesService.add(technologies);
    }
}
