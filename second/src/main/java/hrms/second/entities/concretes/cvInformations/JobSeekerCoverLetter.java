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
@Table(name = "job_seeker_cover_letters")
@Getter
@Setter
public class JobSeekerCoverLetter {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "cover_letter")
	private String coverLetter;
	///////////////////////////////
	@OneToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
}

