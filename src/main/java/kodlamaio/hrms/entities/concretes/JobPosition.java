package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobPostings"})
@Table(name="job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="position")
    private String position;

    @OneToMany(mappedBy = "jobPosition")
    private List<JobPostings> jobPostings;




}
