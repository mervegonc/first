package hrms.second.entities.concretes.cvInformations;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import hrms.second.entities.concretes.users.JobSeeker;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "job_seeker_education_informations")
@Getter
@Setter
public class JobSeekerEducationInformation {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "school_name")
	private String schoolName;
	@Column(name = "department")
	private String department;
	@Column(name = "degree")
	private String degree;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;
	///////////////////////////////
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;

}
