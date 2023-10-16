package hrms.second.entities.concretes.cvInformations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import hrms.second.entities.concretes.cvInformations.enums.StorageType;
import hrms.second.entities.concretes.users.JobSeeker;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "JobSeeker_image_information")
@Getter
@Setter
public class JobSeekerImageInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "imageName")
	private String image_name;
	@Column(name = "image_path")
	private String imagePath;
	///////////////////////////////
	@ManyToOne
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;
	
	@Column(name = "storage_name")
	@Enumerated(EnumType.STRING)
	private StorageType storageName;
	
}
