package hrms.second.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.JobAdvertisementService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("api/JobAdvertisements")
@CrossOrigin
public class JobAdvertisementsController {

	private JobAdvertisementService jobAdvertisementService;
	
	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement){
	
		return jobAdvertisementService.add(jobAdvertisement);
	}
	
	@GetMapping("/findByStatusTrue")
	public Result findByStatusTrue() {
		return jobAdvertisementService.findByStatusTrue();
	}
	
	@GetMapping("/findByCompanyNameAndStatusTrue")
	public Result findByCompanyNameAndStatusTrue(@RequestBody String employer) {
		return jobAdvertisementService.findByEmployerCompanyNameIsAndStatusTrue(employer);
	}
	
	@GetMapping("/findByStatusTrueOrderByApplicationStart")
	public Result findByStatusTrueOrderByApplicationStart() {
		return jobAdvertisementService.findByStatusTrueOrderByApplicationStart();
	}
	
	@GetMapping("/findByStatusTrueOrderByApplicationStart")
	public Result setJobAdvertisementStatusFalse(@PathVariable int jobAdvertisementId) {
		return jobAdvertisementService.setJobAdvertisementStatusFale(jobAdvertisementId);
	}
	
}







