package hrms.second.business.abstracts;

import java.util.List;

import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.users.Employer;
public interface EmployerService {

	Result add(Employer employer);
	Result delete(Employer employer);
	Result update(Employer employer);
	DataResult<List<Employer>> getAll();
}
