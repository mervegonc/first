package hrms.second.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.users.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
