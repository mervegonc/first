package hrms.second.business.abstracts;

import java.util.List;

import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	Result setJobAdvertisementStatusFale(int jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> findByStatusTrue();
	DataResult<List<JobAdvertisement>> findByEmployerCompanyNameIsAndStatusTrue(String companyName);
	DataResult<List<JobAdvertisement>> findByStatusTrueOrderByApplicationStart();
	
}
