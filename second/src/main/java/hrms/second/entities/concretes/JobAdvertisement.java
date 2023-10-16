package hrms.second.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import hrms.second.entities.concretes.users.Employer;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
@Table(name = "job_advertisements")
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "job_description")
	private String jobDescription;
	@Column(name = "job_positionCount")
	private int jobPositionCount;
	@Column(name = "application_start")
	private Date applicationStart;
	@Column(name = "Application_dead_line")
	private Date ApplicationDeadLine;
	@Column(name = "max_salary")
	private int maxSalary;
	@Column(name = "min_salary")
	private int minSalary;
	@Column(name = "status")
	private boolean status;
	///////////////////////////////////////
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	@ManyToOne()
	@JoinColumn(name = "city")
	private City city;
	@ManyToOne()
	@JoinColumn(name = "job_title")
	private JobTitle jobTitle;
	@ManyToOne()
	@JoinColumn(name = "location_type")
	private LocationType locationType;
	
}
