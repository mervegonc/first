package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.cvInformations.JobSeekerCoverLetter;

public interface JobSeekerCoverLetterDao extends JpaRepository<JobSeekerCoverLetter, Integer>{

}
