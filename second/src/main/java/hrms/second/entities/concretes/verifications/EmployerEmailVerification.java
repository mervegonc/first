package hrms.second.entities.concretes.verifications;



import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import hrms.second.entities.concretes.users.Employer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "employers_verification_codes")
@Getter
@Setter
public class EmployerEmailVerification extends EmailVerification{

	@OneToOne
	@JoinColumn(name = "employer_id")
	@ToString.Exclude
	private Employer employer;
	
}
