package hrms.second.business.concretes.cvInformationsManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerWebAddressService;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerWebAddressDao;
import hrms.second.entities.concretes.cvInformations.JobSeekerWebAddress;

@Service
public class JobSeekerWebAddressManager implements JobSeekerWebAddressService{

	private JobSeekerWebAddressDao jobSeekerWebAddressDao;
	@Autowired
	public JobSeekerWebAddressManager(JobSeekerWebAddressDao jobSeekerWebAddressDao) {
		this.jobSeekerWebAddressDao = jobSeekerWebAddressDao;
	}
	@Override
	public Result add(JobSeekerWebAddress jobSeekerWebAddress) {
		jobSeekerWebAddressDao.save(jobSeekerWebAddress);
		return new ResultSuccess("Job seeker web address successfully registered");	
	}
}
