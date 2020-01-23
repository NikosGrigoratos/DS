package gr.hua.dit.ds1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "studentapp")
public class StudentApplication {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "student")
	private String student;
	
	@Column(name = "semester")
	private int semester;
	
	@Column(name = "non_passed_lessons")
	private int nonPassedLessons;
	
	public StudentApplication() {
		
	}

	public StudentApplication(String student, int semester, int nonPassedLessons) {
		this.student = student;
		this.semester = semester;
		this.nonPassedLessons = nonPassedLessons;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getNonPassedLessons() {
		return nonPassedLessons;
	}

	public void setNonPassedLessons(int nonPassedLessons) {
		this.nonPassedLessons = nonPassedLessons;
	}

	@Override
	public String toString() {
		return "StudentApplications [id=" + id + ", student=" + student + ", semester=" + semester
				+ ", nonPassedLessons=" + nonPassedLessons + "]";
	}
	
	
}
