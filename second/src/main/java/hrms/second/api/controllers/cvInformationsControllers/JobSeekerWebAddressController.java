package hrms.second.api.controllers.cvInformationsControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.cvInformationsServices.JobSeekerWebAddressService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.cvInformations.JobSeekerWebAddress;


@RestController
@RequestMapping("api/JobSeekerTalents")
@CrossOrigin
public class JobSeekerWebAddressController {

	private JobSeekerWebAddressService jobSeekerWebAddressService;
	
	@Autowired
	public JobSeekerWebAddressController (JobSeekerWebAddressService jobSeekerWebAddressService) {
		this.jobSeekerWebAddressService = jobSeekerWebAddressService;
		
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody JobSeekerWebAddress jobSeekerWebAddress) {
		return jobSeekerWebAddressService.add(jobSeekerWebAddress);
	}
}
