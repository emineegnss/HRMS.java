package kodlama.io.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import kodlama.io.HRMS.business.abstracts.EmployeesService;
import kodlama.io.HRMS.entities.concretes.Employees;


@RestController
@RequestMapping("/api/Employees")
public class EmployeesController {

	private EmployeesService employeesService;

	@Autowired
	public EmployeesController(EmployeesService employeesService) {
		super();
		this.employeesService = employeesService;
	}
	@GetMapping("/getall")
	public List<Employees> getAll(){
		return this.employeesService.getAll();
	}
	
}
