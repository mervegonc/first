package hrms.second.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.second.entities.concretes.LocationType;

public interface LocationTypeDao extends JpaRepository<LocationType, Integer>{

}
