package hrms.second.business.abstracts.cvInformationsServices;

import java.util.List;

import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.entities.concretes.cvInformations.JobSeekerExperienceInformation;


public interface JobSeekerExperienceInformationService {

	Result add(JobSeekerExperienceInformation jobSeekerExperienceInformation);
	DataResult<List<JobSeekerExperienceInformation>> getAllSorted();
}
