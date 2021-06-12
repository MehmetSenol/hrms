package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.WorkingTimeService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.WorkingTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/workingtime")
public class WorkingTimeController {
    private WorkingTimeService workingTimeService;

    @Autowired
    public WorkingTimeController(WorkingTimeService workingTimeService) {
        this.workingTimeService = workingTimeService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody WorkingTime workingTime) {
        return this.workingTimeService.add(workingTime);
    }
}
