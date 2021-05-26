package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.EmployersService;
import kodlama.io.HRMS.dataAccess.abstracts.EmployersDao;
import kodlama.io.HRMS.entities.concretes.Employers;
@Service
public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	
	@Override
	public void add(Employers employers) {
		
		employersDao.save(employers);
	}

	@Override
	public void delete(int id) {
		
		employersDao.deleteById(id);
	}

	@Override
	public List<Employers> getAll() {
		
		return this.employersDao.findAll();
	}

}
