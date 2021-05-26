package kodlama.io.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlama.io.HRMS.business.abstracts.UserService;
import kodlama.io.HRMS.entities.concretes.Users;
@RestController
@RequestMapping("/api/Users")
public class UserController {

	private UserService userService;
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@GetMapping("/getall")
	public List<Users> getAll(){
		return this.userService.getAll();
	}
	

	

}
