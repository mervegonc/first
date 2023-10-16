package hrms.second.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrms.second.business.abstracts.LocationTypeService;
import hrms.second.core.utilites.results.Result;
import hrms.second.entities.concretes.LocationType;

@RestController
@RequestMapping("api/locationtypes")
@CrossOrigin
public class LocationTypesController {

	private LocationTypeService locationTypeService;
	
	@Autowired
	public LocationTypesController(LocationTypeService locationTypeService) {
		this.locationTypeService = locationTypeService;
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody LocationType locationType ) {
		return locationTypeService.add(locationType);
	}
	
	@GetMapping("/getall")
	public Result getAll() {
		return locationTypeService.getAll();
	}
}
