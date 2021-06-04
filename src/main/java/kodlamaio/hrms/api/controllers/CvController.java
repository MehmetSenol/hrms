package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.CvService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.ErrorDataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/cv")
public class CvController {
    private CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exception){
        Map<String,String> validationErrors=new HashMap<String, String>();
        for (FieldError fieldError:exception.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(),fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errorDateResult=new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");
        return errorDateResult;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@Valid @RequestBody Cv cv){
        return ResponseEntity.ok(this.cvService.add(cv));

    }

    @GetMapping("/getAllBy")
    public DataResult<List<Cv>> getAllBy(){
        return this.cvService.getAll();
    }

    @PostMapping("/uploadimage")
    public Result uploadImage(@RequestBody MultipartFile file, @RequestParam int cvId){
        return this.cvService.uploadImage(file, cvId);
    }
    @GetMapping("/getAllSortedWorkExperience")
    public DataResult<List<Cv>> getAllSortedWorkExperience(){
        return this.cvService.getAllSortedWorkExperience();
    }

    @GetMapping("/getAllSortedSchoolExperience")
    public DataResult<List<Cv>> getAllSortedSchoolExperience(){
        return this.cvService.getAllSortedSchoolExperience();
    }

    @GetMapping("/getAllCandidateId")
    public DataResult<List<Cv>> getAllCandidateId(@RequestParam int candidateId){
        return this.cvService.getAllCandidateId(candidateId);
    }



}
