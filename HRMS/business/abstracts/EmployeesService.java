package kodlama.io.HRMS.business.abstracts;
import java.util.List;
import kodlama.io.HRMS.entities.concretes.Employees;

public interface EmployeesService {
	void add(Employees employees);
	void delete(int id);
	List<Employees> getAll();
	

}
