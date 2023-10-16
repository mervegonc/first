package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.cvInformations.JobSeekerExperienceInformation;

public interface JobSeekerExperienceInformationDao extends JpaRepository<JobSeekerExperienceInformation, Integer> {

}
