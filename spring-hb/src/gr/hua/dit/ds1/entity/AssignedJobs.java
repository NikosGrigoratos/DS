package gr.hua.dit.ds1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "assignedjobs")
public class AssignedJobs {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "student_it")
	private String studentIt;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "company_job")
	private String companyJob;

	public AssignedJobs(String studentIt, String companyName, String companyJob) {
		this.studentIt = studentIt;
		this.companyName = companyName;
		this.companyJob = companyJob;
	}

	public AssignedJobs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentIt() {
		return studentIt;
	}

	public void setStudentIt(String studentIt) {
		this.studentIt = studentIt;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyJob() {
		return companyJob;
	}

	public void setCompanyJob(String companyJob) {
		this.companyJob = companyJob;
	}

	@Override
	public String toString() {
		return "AssignedJobs [id=" + id + ", studentIt=" + studentIt + ", companyName=" + companyName + ", companyJob="
				+ companyJob + "]";
	}
	
	
}
