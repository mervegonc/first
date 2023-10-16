package hrms.second.business.concretes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrms.second.business.abstracts.JobSeekerService;
import hrms.second.business.services.validations.emailVerifications.EmailVerificationService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.DataResultSuccess;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultError;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.JobSeekerDao;
import hrms.second.entities.concretes.users.JobSeeker;
import hrms.second.entities.dtos.JobSeekerMiniCvDto;

@Service
public class JobSeekerManager implements JobSeekerService{
	private JobSeekerDao jobSeekerDao;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao,EmailVerificationService emailVerificationService) {
		this.jobSeekerDao = jobSeekerDao;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		if (jobSeekerDao.findByNationalId(jobSeeker.getNatioanalId()) != null) {
			return new ResultError("Girdiğiniz TC Kimlik No kullanımda");
		}
		
		if(jobSeekerDao.findByemail(jobSeeker.getEmail()) != null) {
			return new ResultError("Girdiğiniz email kullanımda");
		}
		
		if (!(checkIfEmailVerified(jobSeeker).isSuccess())) {
			return new ResultError("Email adresiniz doğrulanmadı");
		}
		
		jobSeekerDao.save(jobSeeker);
		return new ResultSuccess(jobSeeker.getFirst_name() + " Job posting status has been disabled");
		
		
		
	}

	@Override
	public Result delete(JobSeeker jobSeeker) {
		jobSeekerDao.deleteById(jobSeeker.getId());
		
		return new ResultSuccess("İş arayan veritabanından silindi");
	}

	@Override
	public Result update(JobSeeker jobSeeker) {
		jobSeekerDao.saveAndFlush(jobSeeker);
		
		return new ResultSuccess("İş arayan başarılı bir şekilde güncellendi");
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		var result = jobSeekerDao.findAll();
		
		
		return new DataResultSuccess<List<JobSeeker>>(result, "İş arayanlar başarılı bir şekilde listelendi");
	}
	
	
	private Result checkIfEmailVerified(JobSeeker jobSeeker) {
		
		if (emailVerificationService.createJobSeekerEmailVerificationCode(jobSeeker)) {
			return new ResultSuccess();
		}return new ResultError();
	
	}

	@Override
	public DataResult<List<JobSeekerMiniCvDto>>  getJobSeekerWithFullCv() {
		var result = jobSeekerDao. getJobSeekerWithFullCv();
		return new DataResultSuccess<List<JobSeekerMiniCvDto>>(result, "Başarılı");
	}
}
