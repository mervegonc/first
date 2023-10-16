package hrms.second.business.abstracts;

import java.util.List;

import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.JobTitle;

public interface JobTitleService {

	Result add(JobTitle jobTitle);
	Result delete(JobTitle jobTitle);
	Result update(JobTitle jobTitle);
	DataResult<List<JobTitle>> getAll();
}
