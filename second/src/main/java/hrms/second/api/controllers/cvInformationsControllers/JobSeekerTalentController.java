package hrms.second.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerTalentService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.cvInformations.JobSeekerTalent;

	
	@RestController
	@RequestMapping("api/JobSeekerTalents")
	@CrossOrigin
	public class JobSeekerTalentController {

		private JobSeekerTalentService jobSeekerTalentService;
		
		@Autowired
		public JobSeekerTalentController (JobSeekerTalentService jobSeekerTalentService) {
			this.jobSeekerTalentService = jobSeekerTalentService;
			
		}
		
		@PostMapping("/add")
		public Result add (@RequestBody JobSeekerTalent jobSeekerTalent) {
			return jobSeekerTalentService.add(jobSeekerTalent);
		}
}
