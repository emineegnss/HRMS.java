package kodlama.io.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Users {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
    public Users() {
		
	}
	public Users(int id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}
}
