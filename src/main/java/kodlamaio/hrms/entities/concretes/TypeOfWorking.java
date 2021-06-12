package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobPostings"})
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "type_of_working")
public class TypeOfWorking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name ="type_of_works")
    private String typeOfWork;

    @OneToMany(mappedBy = "typeOfWorking")
    private List<JobPostings> jobPostings;

}
