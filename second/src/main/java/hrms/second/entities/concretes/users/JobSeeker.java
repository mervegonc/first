package hrms.second.entities.concretes.users;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hrms.second.entities.concretes.cvInformations.JobSeekerCoverLetter;
import hrms.second.entities.concretes.cvInformations.JobSeekerEducationInformation;
import hrms.second.entities.concretes.cvInformations.JobSeekerExperienceInformation;
import hrms.second.entities.concretes.cvInformations.JobSeekerImageInformation;
import hrms.second.entities.concretes.cvInformations.JobSeekerLanguageInformation;
import hrms.second.entities.concretes.cvInformations.JobSeekerTalent;
import hrms.second.entities.concretes.cvInformations.JobSeekerWebAddress;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "job_seekers")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobSeekerCoverLetter","JobSeekerEducationInformation",
	"JobSeekerExperienceInformation","JobSeekerImageInformation","JobSeekerLanguageInformation","JobSeekerTalent","JobSeekerWebAddress"})
public class JobSeeker extends User{

	@Column(name = "first_name")
	private String first_name;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "natioanal_id")
	private String natioanalId;
	@Column(name = "birt_date")
	private Date birthDate;
	//////////////////////////////////////
	@OneToOne(mappedBy = "jobSeeker")
	private List<JobSeekerCoverLetter> jobSeekerCoverLetter;
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerEducationInformation> jobSeekerEducationInformation;
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerExperienceInformation> jobSeekerExperienceInformation;
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerImageInformation> jobSeekerImageInformation;
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerLanguageInformation> jobSeekerLanguageInformation;
	@OneToMany(mappedBy = "jobSeeker")
	private List<JobSeekerTalent> jobSeekerTalent;
	@OneToOne(mappedBy = "jobSeeker")
	private List<JobSeekerWebAddress> jobSeekerWebAddress;
}
















