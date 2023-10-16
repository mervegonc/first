package hrms.second.entities.concretes.verifications;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import hrms.second.entities.concretes.users.JobSeeker;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "job_seekers_verifications")
@Getter
@Setter
public class JobSeekerEmailVerification {

	@OneToOne
	@JoinColumn(name = "job_seeker_id")
	@ToString.Exclude
	private JobSeeker jobSeeker;
	
}
