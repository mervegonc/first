package hrms.second.entities.concretes.cvInformations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import hrms.second.entities.concretes.users.JobSeeker;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "JobSeeker_language_information")
@Getter
@Setter
public class JobSeekerLanguageInformation {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "language_name")
	private String languageName;
	@Column(name = "language_level")
	private String languageLevel;
	///////////////////////////////
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
}
