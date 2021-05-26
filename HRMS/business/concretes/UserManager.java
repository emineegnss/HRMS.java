package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.UserService;
import kodlama.io.HRMS.dataAccess.abstracts.UserDao;
import kodlama.io.HRMS.entities.concretes.Users;
@Service
public class UserManager implements UserService {

	private UserDao userDao;
	@Override
	public List<Users> getAll() {
		
		return this.userDao.findAll();
	}

}
