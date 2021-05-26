package kodlama.io.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.HRMS.business.abstracts.EmployeesService;
import kodlama.io.HRMS.dataAccess.abstracts.EmployeesDao;
import kodlama.io.HRMS.entities.concretes.Employees;
@Service
public class EmployeesManager implements EmployeesService {

	private EmployeesDao employeesDao;
	
	@Override
	public void add(Employees employees) {
		employeesDao.save(employees);
		
	}

	@Override
	public void delete(int id) {
		employeesDao.deleteById(id);
		
	}

	@Override
	public List<Employees> getAll() {
		
		return this.employeesDao.findAll();
	}

}
