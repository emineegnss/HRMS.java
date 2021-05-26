package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer> {

}
