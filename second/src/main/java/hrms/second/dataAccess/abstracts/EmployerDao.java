package hrms.second.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.users.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
