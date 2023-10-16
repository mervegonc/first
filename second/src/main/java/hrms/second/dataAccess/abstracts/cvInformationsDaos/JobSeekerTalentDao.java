package hrms.second.dataAccess.abstracts.cvInformationsDaos;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.cvInformations.JobSeekerTalent;

public interface JobSeekerTalentDao extends JpaRepository<JobSeekerTalent, Integer> {

}
