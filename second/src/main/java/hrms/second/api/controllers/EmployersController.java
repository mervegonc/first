package hrms.second.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.EmployerService;
import hrms.second.core.utilites.results.DataResult;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.users.Employer;


@RestController
@RequestMapping("api/employers")
@CrossOrigin
public class EmployersController {

	private EmployerService employerService;
	
	@Autowired
	public EmployersController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return employerService.getAll();
				
				}
	
	
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return employerService.add(employer);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody Employer employer) {
		return employerService.delete(employer);
	}
	
	@PostMapping("/add")
	public Result update(@RequestBody Employer employer) {
		return employerService.update(employer);
	}
	
	
}
