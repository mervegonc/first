package hrms.second.business.concretes.cvInformationsManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerCoverLetterService;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerCoverLetterDao;
import hrms.second.entities.concretes.cvInformations.JobSeekerCoverLetter;

@Service
public class JobSeekerCoverLetterManager implements  JobSeekerCoverLetterService{

	@Override
	public Result add(JobSeekerCoverLetter jobSeekerCoverLetter) {
		jobSeekerCoverLetterDao.save(jobSeekerCoverLetter);
		return new ResultSuccess("Cover letter added successfully");
	}
	
	private JobSeekerCoverLetterDao jobSeekerCoverLetterDao;
	
	@Autowired
	public JobSeekerCoverLetterManager(JobSeekerCoverLetterDao jobSeekerCoverLetterDao) {
		this.jobSeekerCoverLetterDao = jobSeekerCoverLetterDao;
	}

}
