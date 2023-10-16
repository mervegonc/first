package hrms.second.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.CityService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.City;


@RestController
@RequestMapping("api/cities")
@CrossOrigin
public class CitiesController {

	private CityService cityService;
	
	@Autowired
	public CitiesController(CityService cityService) {
		this.cityService = cityService;
	}
	
	@PostMapping("/add")
	public Result add (@RequestBody City city) {
		return cityService.add(city);
	}
	
	@GetMapping("/getall")
	public Result getAll() {
		return cityService.getAll();
	}
}
