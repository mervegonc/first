package hrms.second.business.services.validations.emailVerifications;

import hrms.second.entities.concretes.users.Employer;
import hrms.second.entities.concretes.users.JobSeeker;

public class EmailVerificationManager implements EmailVerificationService{
	@Override
	public boolean createEmployerEmailVerificationCode(Employer employer) {
		return true;
	}

	@Override
	public boolean createJobSeekerEmailVerificationCode(JobSeeker jobSeeker) {
		return true;
	}
}
