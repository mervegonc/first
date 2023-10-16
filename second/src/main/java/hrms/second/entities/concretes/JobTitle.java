package hrms.second.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_title")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "titles")
	private String title;
	///////////////////////////////////////
	@OneToMany(mappedBy = "city")
	private List<JobAdvertisement> jobAdvertisements;
}
