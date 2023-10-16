package hrms.second.entities.concretes.cvInformations;

import java.util.Date;

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
@Table(name ="job_seeker_experience_informations")
@Getter
@Setter
public class JobSeekerExperienceInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "institution")
	private String institution;
	@Column(name = "role")
	private String role;
	@Column(name = "job_start_date")
	private Date jobStartDate;
	@Column(name = "job_end_date")
	private String jobEndDate;
	///////////////////////////////
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
}
