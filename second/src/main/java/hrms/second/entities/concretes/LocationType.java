package hrms.second.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "location_types")
public class LocationType {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "location_name")
	private String locationName;
    ///////////////////////////////////////
	@OneToMany(mappedBy = "city")
	private List<JobAdvertisement> jobAdvertisements;
	
}

