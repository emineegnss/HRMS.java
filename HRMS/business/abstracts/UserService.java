package kodlama.io.HRMS.business.abstracts;
import java.util.List;

import kodlama.io.HRMS.entities.concretes.Users;
public interface UserService {

	List<Users> getAll();
}
