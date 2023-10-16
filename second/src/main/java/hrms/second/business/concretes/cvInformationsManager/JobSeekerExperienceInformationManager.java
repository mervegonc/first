
package hrms.second.business.concretes.cvInformationsManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerExperienceInformationService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.cvInformationsDaos.JobSeekerExperienceInformationDao;
import hrms.second.entities.concretes.cvInformations.JobSeekerExperienceInformation;

@Service
public class JobSeekerExperienceInformationManager implements  JobSeekerExperienceInformationService{

	private JobSeekerExperienceInformationDao jobSeekerExperienceInformationDao;
	@Autowired 
	public JobSeekerExperienceInformationManager(JobSeekerExperienceInformationDao jobSeekerExperienceInformationDao) {
		this.jobSeekerExperienceInformationDao = jobSeekerExperienceInformationDao;
	}
	@Override
	public Result add(JobSeekerExperienceInformation jobSeekerExperienceInformation) {
		jobSeekerExperienceInformationDao.save(jobSeekerExperienceInformation);
		return new ResultSuccess("İş arayan deneyimi başarılı bir şekilde kaydedildi");
	}
	@Override
	public DataResult<List<JobSeekerExperienceInformation>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC,"endDate");
		var result = jobSeekerExperienceInformationDao.findAll(sort);
		return new DataResultSuccess<List<JobSeekerExperienceInformation>>(result,"Job seeker experience successfully listed");
	}
}
