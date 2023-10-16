package hrms.second.business.abstracts;

import java.util.List;

import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.users.JobSeeker;
import hrms.second.entities.dtos.JobSeekerMiniCvDto;

public interface JobSeekerService {

	Result add(JobSeeker jobSeeker);
	Result delete(JobSeeker jobSeeker);
	Result update(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>> getAll();
	DataResult<List<JobSeekerMiniCvDto>> getJobSeekerWithFullCv();
	}
