package kodlama.io.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.HRMS.entities.concretes.JobPositions;

public interface JobPositionsDao extends JpaRepository<JobPositions, Integer> {

}
