package hrms.second.business.abstracts;

import java.util.List;

import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.City;

public interface CityService {

	Result add(City city);
	DataResult<List<City>> getAll();
}
