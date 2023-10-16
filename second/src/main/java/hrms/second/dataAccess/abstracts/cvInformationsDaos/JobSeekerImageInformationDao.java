package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.cvInformations.JobSeekerImageInformation;

public interface JobSeekerImageInformationDao extends JpaRepository<JobSeekerImageInformation, Integer>  {

}
