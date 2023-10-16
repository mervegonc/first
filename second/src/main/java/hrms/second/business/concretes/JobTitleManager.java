package hrms.second.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.JobTitleService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.JobTitleDao;
import hrms.second.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {

		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public DataResult<List<JobTitle>>  getAll() {
		
		var result = jobTitleDao.findAll();
		
		return new DataResultSuccess<List<JobTitle>>(result,"Meslekler listelendi"); 
	}


	@Override
	public Result add(JobTitle jobTitle) {
	 jobTitleDao.save(jobTitle);
	 return new ResultSuccess(jobTitle.getTitle()+ " veritabanına eklendi");
		
	}


	@Override
	public Result delete(JobTitle jobTitle) {
		jobTitleDao.deleteById(jobTitle.getId());
		return new ResultSuccess(jobTitle.getTitle()+ " veritabanındab silindi");
	}


	@Override
	public Result update(JobTitle jobTitle) {
		
		jobTitleDao.saveAndFlush(jobTitle);
		return new ResultSuccess("Meslek " +jobTitle.getTitle()+" olarak güncellendi");
	}
}
