package hrms.second.api.controllers.cvInformationsControllers;

import java.util.List;


import hrms.second.business.abstracts.cvInformationsServices.JobSeekerExperienceInformationService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.cvInformations.JobSeekerExperienceInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/JobSeekerExperienceInformations")
@CrossOrigin
public class JobSeekerExperienceInformationController {

	private JobSeekerExperienceInformationService  JobSeekerExperienceInformationService;
	
	@Autowired
	public JobSeekerExperienceInformationController(JobSeekerExperienceInformationService  JobSeekerExperienceInformationService) {
		this.JobSeekerExperienceInformationService = JobSeekerExperienceInformationService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerExperienceInformation JobSeekerExperienceInformation) {
		return JobSeekerExperienceInformationService.add(JobSeekerExperienceInformation);
		
	}
	
	@GetMapping("/getAllSorted")
	public DataResult <List<JobSeekerExperienceInformation>> getAllSorted(){
		return JobSeekerExperienceInformationService.getAllSorted();
	}
}
