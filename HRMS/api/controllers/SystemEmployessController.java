package kodlama.io.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlama.io.HRMS.business.abstracts.SystemEmployessService;
import kodlama.io.HRMS.entities.concretes.SystemEmployess;

@RestController
@RequestMapping("/api/SystemEmployess")
public class SystemEmployessController {
	private SystemEmployessService systemEmployessService;

	@Autowired
	public SystemEmployessController(SystemEmployessService systemEmployessService) {
		super();
		this.systemEmployessService = systemEmployessService;
	}
	@GetMapping("/getall")
	public List<SystemEmployess> getAll(){
		return this.systemEmployessService.getAll();
	}
	

}
