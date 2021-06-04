package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cv"})
@Table(name = "schools")
public class Schools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int schoolId;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "school_department_name")
    private String schollDepartmentName;

    @Column(name = "school_start_date")
    private LocalDate schoolStartDate;

    @Column(name = "date_of_graduation",nullable = true)
    private LocalDate dateOfGraduation;

    @Column(name = "graduation_check")
    private boolean graduationCheck;

    @OneToMany(mappedBy = "schools")
    private List<Cv> cv;









}
