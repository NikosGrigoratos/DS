package gr.hua.dit.ds1.restcontroller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.ds1.dao.StudentApplicationDAO;
import gr.hua.dit.ds1.entity.StudentApplication;

@RestController
@RequestMapping("/studentapp")
public class StudentAppRestController {

	@Autowired
	StudentApplicationDAO studentAppDAO;

	@PostMapping("/addstapp")
	public StudentApplication addCustomer(@RequestBody StudentApplication theApp) {
		theApp.setId(0);
		studentAppDAO.addStudentApp(theApp);

		return theApp;
	}
}
