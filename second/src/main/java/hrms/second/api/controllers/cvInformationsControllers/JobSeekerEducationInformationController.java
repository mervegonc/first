package hrms.second.api.controllers.cvInformationsControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerEducationInformationService;
import hrms.second.core.utilites.results.Result;
import hrms.second.core.utilites.results.DataResult;

import hrms.second.entities.concretes.cvInformations.JobSeekerEducationInformation;

@RestController
@RequestMapping("api/JobSeekerEducationInformations")
@CrossOrigin
public class JobSeekerEducationInformationController {
	 private JobSeekerEducationInformationService jobSeekerEducationInformationService;
	 
	 @Autowired
	 public JobSeekerEducationInformationController(JobSeekerEducationInformationService jobSeekerEducationInformationService) {
		 this.jobSeekerEducationInformationService = jobSeekerEducationInformationService;
	 }

	 @PostMapping("/add")
	 public Result add(@RequestBody JobSeekerEducationInformation jobSeekerEducationInformation ) {
		 return jobSeekerEducationInformationService.add(jobSeekerEducationInformation);
	 }
	 
	 @GetMapping("/getall")
	 public Result getAll() {
		 return jobSeekerEducationInformationService.getAll();
	 }
	 
	 
	 @GetMapping("/getallsorted")
	 public DataResult <List<JobSeekerEducationInformation>> getAllSorted(){
		 return jobSeekerEducationInformationService.getAllSorted();
	 }
	 
}

