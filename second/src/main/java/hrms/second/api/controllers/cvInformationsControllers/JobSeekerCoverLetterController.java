package hrms.second.api.controllers.cvInformationsControllers;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerCoverLetterService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.cvInformations.JobSeekerCoverLetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/jobseekercoverletters")
@CrossOrigin
public class JobSeekerCoverLetterController {

	private JobSeekerCoverLetterService JobSeekerCoverLetterService;
	
	@Autowired
	public JobSeekerCoverLetterController (JobSeekerCoverLetterService JobSeekerCoverLetterService) {
		this.JobSeekerCoverLetterService = JobSeekerCoverLetterService;
		
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody JobSeekerCoverLetter jobSeekerCoverLetter) {
		return JobSeekerCoverLetterService.add(jobSeekerCoverLetter);
	}
	
}
