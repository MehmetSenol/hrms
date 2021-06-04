package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cv"})
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidate_job_experiences" )
public class CandidateJobExperiences {
    @Id
    @GeneratedValue
    @Column(name = "job_experiences_id")
    private int jobExperiencesId;

    @Column(name = "job_company_name")
    private String jobCompanyName;

    @Column(name="job_position")
    private String jobPosition;

    @Column(name = "company_start_date")
    private LocalDate companyStartDate;

    @Column(name = "job_departure",nullable = true)
    private LocalDate jobDeparture;

    @OneToMany(mappedBy = "candidateJobExperiences")
    private List<Cv> cv;




}
