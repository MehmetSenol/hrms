package kodlamaio.hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
public class Cv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cv_id")
    private int cvId;

    @Column(name = "candidate_cover_letter")
    private String candidateCoverLetter;

    @Column(name = "github_adress", nullable=true)
    private String githubAdress;

    @Column(name = "linkedin_adress", nullable=true)
    private String linkedinAdress;

    @Column(name = "image",nullable = true)
    private String image;

    @ManyToOne()
    @JoinColumn(name = "candidate_job_experiences_id")
    private CandidateJobExperiences candidateJobExperiences;

    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    @ManyToOne()
    @JoinColumn(name = "languages_id")
    private Languages languages;

    @ManyToOne()
    @JoinColumn(name = "schools_id")
    private Schools schools;

    @ManyToOne()
    @JoinColumn(name = "technologies_id")
    private Technologies technologies;




}
