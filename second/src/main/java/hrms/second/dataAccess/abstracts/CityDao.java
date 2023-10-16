package hrms.second.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}
