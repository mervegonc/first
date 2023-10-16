package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;
import hrms.second.entities.concretes.cvInformations.JobSeekerEducationInformation;

public interface JobSeekerEducationInformationDao extends JpaRepository<JobSeekerEducationInformation, Integer>{

}
