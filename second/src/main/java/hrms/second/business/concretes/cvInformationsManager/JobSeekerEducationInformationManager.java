package hrms.second.business.concretes.cvInformationsManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerEducationInformationService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerEducationInformationDao;
import hrms.second.entities.concretes.cvInformations.JobSeekerEducationInformation;

@Service
public class JobSeekerEducationInformationManager implements JobSeekerEducationInformationService{

	private JobSeekerEducationInformationDao jobSeekerEducationInformationDao ;
	
	@Autowired
	public JobSeekerEducationInformationManager(JobSeekerEducationInformationDao jbSeekerEducationInformationDao) {
		this.jobSeekerEducationInformationDao = jobSeekerEducationInformationDao;
	}
	@Override
	public Result add(JobSeekerEducationInformation jobSeekerEducationInformation) {
		jobSeekerEducationInformationDao.save(jobSeekerEducationInformation);
		return new ResultSuccess("Job seeker education information has been successfully recorded");
	}
	@Override
	public DataResult<List<JobSeekerEducationInformation>> getAll() {
		var result = jobSeekerEducationInformationDao.findAll();
		return new DataResultSuccess<List<JobSeekerEducationInformation>>(result,"Success");
	}
	@Override
	public DataResult<List<JobSeekerEducationInformation>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"endDate");
		var result = jobSeekerEducationInformationDao.findAll(sort);
		return new DataResultSuccess<List<JobSeekerEducationInformation>>(result,"Job seeker education information listed successfully");
	}
	

}
