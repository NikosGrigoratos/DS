package gr.hua.dit.ds1.dao;

import java.util.List;

import gr.hua.dit.ds1.entity.StudentApplication;


public interface StudentApplicationDAO {
	public List<StudentApplication> getStudentApps();
	public String addStudentApp(String id);
	public String deleteStudentApp(String id);
}
