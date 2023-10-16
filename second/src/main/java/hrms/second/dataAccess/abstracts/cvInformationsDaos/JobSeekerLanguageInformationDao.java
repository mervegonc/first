package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.cvInformations.JobSeekerLanguageInformation;

public interface JobSeekerLanguageInformationDao extends JpaRepository<JobSeekerLanguageInformation, Integer>{

}
