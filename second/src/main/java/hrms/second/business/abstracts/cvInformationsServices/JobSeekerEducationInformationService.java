package hrms.second.business.abstracts.cvInformationsServices;

import java.util.List;

import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.entities.concretes.cvInformations.JobSeekerEducationInformation;

public interface JobSeekerEducationInformationService {

	Result add(JobSeekerEducationInformation jobSeekerEducationInformation);
	DataResult <List<JobSeekerEducationInformation>> getAll();
	DataResult <List<JobSeekerEducationInformation>> getAllSorted();
}
