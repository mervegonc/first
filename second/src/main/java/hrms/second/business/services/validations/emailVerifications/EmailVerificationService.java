package hrms.second.business.services.validations.emailVerifications;



import hrms.second.entities.concretes.users.Employer;
import hrms.second.entities.concretes.users.JobSeeker;

public interface EmailVerificationService {

	boolean createEmployerEmailVerificationCode(Employer employer);
	boolean createJobSeekerEmailVerificationCode(JobSeeker jobSeeker);
}
