package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.SystemEmployessService;
import kodlama.io.HRMS.dataAccess.abstracts.SystemEmployessDao;
import kodlama.io.HRMS.entities.concretes.SystemEmployess;
@Service
public class SystemEmployessManager implements SystemEmployessService {

	private SystemEmployessDao systemEmployessDao;
	@Override
	public void add(SystemEmployess systemEmployess) {
		systemEmployessDao.save(systemEmployess);
		
	}

	@Override
	public void delete(int id) {
		systemEmployessDao.deleteById(id);
		
	}

	@Override
	public List<SystemEmployess> getAll() {
		
		return this.systemEmployessDao.findAll();
	}

}
