package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CandidateJobExperiencesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CandidateJobExperiences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/candidatejobexperiencescontroller")
public class CandidateJobExperiencesController {
    private CandidateJobExperiencesService candidateJobExperiencesService;

    @Autowired
    public CandidateJobExperiencesController(CandidateJobExperiencesService candidateJobExperiencesService) {
        this.candidateJobExperiencesService = candidateJobExperiencesService;
    }
    @PostMapping("/add")
    public Result add(@RequestBody CandidateJobExperiences candidateJobExperiences) {
        return this.candidateJobExperiencesService.add(candidateJobExperiences);
    }
}
