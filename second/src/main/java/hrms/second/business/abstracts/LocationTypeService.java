package hrms.second.business.abstracts;

import java.util.List;

import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.LocationType;

public interface LocationTypeService {

	Result add(LocationType locationType);
	DataResult<List<LocationType>> getAll();
}
