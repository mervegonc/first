package hrms.second.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerLanguageInformationService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.cvInformations.JobSeekerLanguageInformation;

@RestController
@RequestMapping("api/jobSeekerLanguageInformations")
@CrossOrigin
public class JobSeekerLanguageInformationController {

	private JobSeekerLanguageInformationService jobSeekerLanguageInformationService;
	
	@Autowired
	public JobSeekerLanguageInformationController(JobSeekerLanguageInformationService jobSeekerLanguageInformationService) {
		this.jobSeekerLanguageInformationService = jobSeekerLanguageInformationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerLanguageInformation jobSeekLanguageInformation) {
		return jobSeekerLanguageInformationService.add(jobSeekLanguageInformation);
	}
}
