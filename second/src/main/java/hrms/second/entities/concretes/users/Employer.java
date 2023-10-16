package hrms.second.entities.concretes.users;
import hrms.second.entities.concretes.JobAdvertisement;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "epmloyers")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisments"})
public class Employer extends User{

	@Column(name = "company_name")
	private String companyName;
	@Column(name = "web_address")
	private String webAddress;
	@Column(name = "phone_number")
	private String phoneNumber;
////////////////////////////////////////
@OneToMany
@JoinColumn(name = "employer")
private List<JobAdvertisement> jobAdvertisements;
}
