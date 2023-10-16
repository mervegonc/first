package hrms.second.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

}
