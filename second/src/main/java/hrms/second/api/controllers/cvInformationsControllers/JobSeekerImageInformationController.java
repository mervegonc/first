package hrms.second.api.controllers.cvInformationsControllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import hrms.second.business.abstracts.cvInformationsServices.JobSeekerImageInformationService;

import hrms.second.core.utilites.results.Result;


@RestController
@RequestMapping("api/jobSeekerImageInformations")
@CrossOrigin
public class JobSeekerImageInformationController {

	private JobSeekerImageInformationService JobSeekerImageInformationService;
	
	@Autowired
	public JobSeekerImageInformationController(JobSeekerImageInformationService JobSeekerImageInformationService) {
		this.JobSeekerImageInformationService = JobSeekerImageInformationService;
	}
	
	@PostMapping("/add")
	public Result uploadfile(@RequestParam("file") MultipartFile file, @RequestParam  int jobSeekerId ) {
		return JobSeekerImageInformationService.add(file, jobSeekerId);
		
	}
	
	

}
