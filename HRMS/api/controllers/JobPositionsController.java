package kodlama.io.HRMS.api.controllers;
import kodlama.io.HRMS.entities.concretes.JobPositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import kodlama.io.HRMS.business.abstracts.JobPositionsService;


@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {
	private JobPositionsService jobPositionsService;

	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}
	@GetMapping("/getall")
	public List<JobPositions> getAll(){
		return this.jobPositionsService.getAll();
	}

}
