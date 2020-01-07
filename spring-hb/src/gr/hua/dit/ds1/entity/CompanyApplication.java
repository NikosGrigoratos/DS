package gr.hua.dit.ds1.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CompanyApplication {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "position_field")
	private String positionField;
	
	@Column(name = "position")
	private String position;
	
	public CompanyApplication() {
		
	}

	public CompanyApplication(String company, String positionField, String position) {
		this.company = company;
		this.positionField = positionField;
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPositionField() {
		return positionField;
	}

	public void setPositionField(String positionField) {
		this.positionField = positionField;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "CompanyApplication [id=" + id + ", company=" + company + ", positionField=" + positionField
				+ ", position=" + position + "]";
	}
	
	
}
