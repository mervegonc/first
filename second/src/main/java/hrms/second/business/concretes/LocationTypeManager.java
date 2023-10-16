package hrms.second.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.LocationTypeService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.LocationTypeDao;
import hrms.second.entities.concretes.LocationType;

@Service
public class LocationTypeManager implements LocationTypeService{
LocationTypeDao locationTypeDao;
	


@Autowired
public LocationTypeManager(LocationTypeDao locationTypeDao) {
	this.locationTypeDao = locationTypeDao;
}


@Override
public Result add(LocationType locationType) {
	locationTypeDao.save(locationType);
	return new ResultSuccess("Location saved successfully");
}


@Override
public DataResult<List<LocationType>> getAll() {
	var result = locationTypeDao.findAll();
	return new DataResultSuccess<List<LocationType>>(result,"Locations listed successfully");
}
}
