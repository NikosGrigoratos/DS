package gr.hua.dit.ds1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "it")
	private String it;
	
	@Column(name = "password")
	private String password;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String it, String password) {
		super();
		this.it = it;
		this.password = password;
	}

	public String getIt() {
		return it;
	}

	public void setIt(String it) {
		this.it = it;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [it=" + it + ", password=" + password + "]";
	}

	
	
}
