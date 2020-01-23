package gr.hua.dit.ds1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.ds1.dao.StudentApplicationDAO;
import gr.hua.dit.ds1.entity.StudentApplication;

@Controller
@RequestMapping("/studentApps")
public class StudentApplicationController {
	
	@Autowired
    private StudentApplicationDAO studentAppsDAO;
	
	@RequestMapping("/list")
    public String listStudentApps(Model model) {
		List<StudentApplication> studentApps = studentAppsDAO.getStudentApps();
        
        // add the customers to the model
        model.addAttribute("studentApps", studentApps);
        	
            return "list-student-apps";
    }
	
	@RequestMapping("/add")
	public String addStudentAppForm() {
		return "add-student-app-form";
	}
	
	@RequestMapping("/delete")
	public String removeCompanyAppForm() {
		return "remove-student-app-form";
	}
	
	@RequestMapping("/addProcess")
	public String addStudentApp(HttpServletRequest request, Model model) {
		String theApp = request.getParameter("studentAppToAdd");
		studentAppsDAO.addStudentApp(theApp);
		return null;
	}
	
	@RequestMapping("/deleteProcess")
	public String deleteStudentApp(HttpServletRequest request, Model model) {
		String theApp = request.getParameter("studentAppToDel");
		int result = Integer.parseInt(theApp);
		studentAppsDAO.deleteStudentApp(result);
		return "delete-done";
	}
}
