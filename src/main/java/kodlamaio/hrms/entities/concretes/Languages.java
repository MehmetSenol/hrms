package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","cv"})
@Table(name = "languages")
public class Languages {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int languageId;

    @Column(name = "language_name")
    private String languageName;

    @Column(name = "language_level")
    private int languageLevel;

    @OneToMany(mappedBy = "languages")
    private List<Cv> cv;


}
