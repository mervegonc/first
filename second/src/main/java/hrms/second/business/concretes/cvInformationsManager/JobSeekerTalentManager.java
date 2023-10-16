package hrms.second.business.concretes.cvInformationsManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerTalentService;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerTalentDao;
import hrms.second.entities.concretes.cvInformations.JobSeekerTalent;

@Service
public class JobSeekerTalentManager implements JobSeekerTalentService{

	private JobSeekerTalentDao jobSeekerTalentDao;
	@Autowired
	public JobSeekerTalentManager(JobSeekerTalentDao jobSeekerTalentDao) {
		this.jobSeekerTalentDao = jobSeekerTalentDao;
	}
	@Override
	public Result add(JobSeekerTalent jobSeekerTalent) {
		jobSeekerTalentDao.save(jobSeekerTalent);
		return new ResultSuccess("Job seeker talent successfully registered");
	}
}
