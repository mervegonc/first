package hrms.second.business.concretes.cvInformationsManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerLanguageInformationService;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerLanguageInformationDao;
import hrms.second.entities.concretes.cvInformations.JobSeekerLanguageInformation;

@Service
public class JobSeekerLanguageInformationManager implements  JobSeekerLanguageInformationService{

	private JobSeekerLanguageInformationDao jobSeekerLanguageInformationDao;
	@Autowired
	public JobSeekerLanguageInformationManager(JobSeekerLanguageInformationDao jobSeekerLanguageInformationDao) {
		this.jobSeekerLanguageInformationDao = jobSeekerLanguageInformationDao;
	}
	@Override
	public Result add(JobSeekerLanguageInformation jobSeekerLanguageInformation) {
		jobSeekerLanguageInformationDao.save(jobSeekerLanguageInformation);
		return new ResultSuccess("Job seeker language information has been successfully saved");
	}
}
