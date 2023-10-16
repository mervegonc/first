package hrms.second.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.JobAdvertisementService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.JobAdvertisementDao;
import hrms.second.entities.concretes.JobAdvertisement;

public class JobAdvertisementManager implements JobAdvertisementService{

	JobAdvertisementDao jobAdvertisementDao;
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		this.jobAdvertisementDao = jobAdvertisementDao;
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		jobAdvertisementDao.save(jobAdvertisement);
		
		  return new ResultSuccess("Job posting added successfully");
	}

	@Override
	public Result setJobAdvertisementStatusFale(int jobAdvertisementId) {
		JobAdvertisement jobAdvertisement = jobAdvertisementDao.findById(jobAdvertisementId).orElseThrow(
				()-> new IllegalArgumentException("Girilen id ile işleşen bir ilan bulunamadı"+ jobAdvertisementId));
		
		jobAdvertisement.setStatus(false);
		jobAdvertisementDao.saveAndFlush(jobAdvertisement);
		
		return new ResultSuccess("Job posting status has been disabled");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		var result = jobAdvertisementDao.findAll();
		return new DataResultSuccess<List<JobAdvertisement>>(result, "Job postings listed successfully");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByStatusTrue() {
		var result = jobAdvertisementDao.findByStatusTrue();
		return new DataResultSuccess<List<JobAdvertisement>>(result, " Active job postings have been listed successfully");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByEmployerCompanyNameIsAndStatusTrue(String companyName) {
		var result = jobAdvertisementDao.findByEmployerCompanyNameIsAndStatusTrue(companyName);
		return new DataResultSuccess<List<JobAdvertisement>>(result,  "Active job postings of the company have been successfully listed");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByStatusTrueOrderByApplicationStart() {
		var result = jobAdvertisementDao.findByStatusTrueOrderByApplicationStart();
		return new DataResultSuccess<List<JobAdvertisement>>(result, "The job posting has been listed successfully");
	}

	
		
		
	}
	





