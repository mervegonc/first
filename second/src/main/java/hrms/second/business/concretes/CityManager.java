package hrms.second.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.CityService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.CityDao;
import hrms.second.entities.concretes.City;

@Service
public class CityManager implements CityService{

	@Autowired
	private CityDao cityDao;
	public CityManager(CityDao cityDao) {
		this.cityDao = cityDao;
	}
	@Override
	public Result add(City city) {
		cityDao.save(city);
		return new ResultSuccess("City successfully saved");
	}
	@Override
	public DataResult<List<City>> getAll() {
		var result = cityDao.findAll();
		return new DataResultSuccess<List<City>>(result,"Cities listed successfully");
	}
}
