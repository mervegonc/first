package hrms.second.entities.concretes.cvInformations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import hrms.second.entities.concretes.users.JobSeeker;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "JobSeeker_web_address")
@Getter
@Setter
public class JobSeekerWebAddress {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "github_link")
	private String githubLink;
	@Column(name = "linkedin_link")
	private String  linkedinLink;
	///////////////////////////////
	@OneToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;

}
