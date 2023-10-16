package hrms.second.entities.concretes.confirms;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employee_confirms_employers")
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeConfirmEmployer {

	
	@Column(name = "employer_id")
	private int employerId;
	
}
