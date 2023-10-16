package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import hrms.second.entities.concretes.cvInformations.JobSeekerWebAddress;

public interface JobSeekerWebAddressDao extends JpaRepository<JobSeekerWebAddress, Integer> {

}
