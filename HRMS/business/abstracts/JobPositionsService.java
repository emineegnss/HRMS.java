package kodlama.io.HRMS.business.abstracts;
import java.util.List;


import kodlama.io.HRMS.entities.concretes.JobPositions;

public interface JobPositionsService {

	List<JobPositions> getAll();
}
