package hrms.second.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hrms.second.business.services.validations.emailVerifications.EmailVerificationService;
import hrms.second.business.abstracts.EmployerService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.ResultError;
import hrms.second.core.utilites.results.ResultSuccess;
import hrms.second.dataAccess.abstracts.EmployerDao;
import hrms.second.entities.concretes.users.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmailVerificationService emailVerificationService;
	
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public Result delete(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Employer employer) {
		if (!(emailVerificationService.createEmployerEmailVerificationCode(employer))) {
			return new ResultError("Email doğrulaması başarısız");
		}
		
		if (!(checkIfEmailExist(employer).isSuccess())) {
			return new ResultError("Girdiğiniz email kullanımda");
		}
		
		employerDao.save(employer);
		
		return new ResultSuccess("İş veren kaydı başarılı bir şekilde gerçekleşti ");
	}

	private Result checkIfEmailExist(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}
}
