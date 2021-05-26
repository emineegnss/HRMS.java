package kodlama.io.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "employees")
public class Employees {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_no")
	private String nationalityNo;
	
	@Column(name = "year_of_birth")
	private String yearOfBirth;
	public Employees() {
		
	}

	public Employees(int id, String firstName, String lastName, String nationalityNo, String yearOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityNo = nationalityNo;
		this.yearOfBirth = yearOfBirth;
	}
	

}
