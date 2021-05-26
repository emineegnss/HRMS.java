package kodlama.io.HRMS.business.abstracts;
import java.util.List;
import kodlama.io.HRMS.entities.concretes.SystemEmployess;

public interface SystemEmployessService {
	void add(SystemEmployess systemEmployess);
	void delete(int id);
	List<SystemEmployess> getAll();

}
