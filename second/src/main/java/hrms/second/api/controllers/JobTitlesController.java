package hrms.second.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.JobTitleService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.JobTitle;

@RestController
@RequestMapping("api/jobTitles")
@CrossOrigin
public class JobTitlesController {

	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobTitle>> getAll(){
		return jobTitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle){
		return jobTitleService.add(jobTitle);
		
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobTitle jobTitle){
		return jobTitleService.delete(jobTitle);
		
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody JobTitle jobTitle){
		return jobTitleService.update(jobTitle);
		
	}
}
