package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.SystemEmployess;

public interface SystemEmployessDao extends JpaRepository<SystemEmployess, Integer> {

}
