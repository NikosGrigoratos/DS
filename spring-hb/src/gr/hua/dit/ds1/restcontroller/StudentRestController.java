package gr.hua.dit.ds1.restcontroller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.ds1.dao.StudentDAO;
import gr.hua.dit.ds1.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
		@Autowired
		private StudentDAO studentDAO;
        
        @GetMapping("/hello")
        public String sayHello() {
                return "Hello World!";
        }
        
        @GetMapping("/verify/{studentId}")
    	public Student getStudent(@PathVariable String studentId) {
    		Student res = studentDAO.getStudentCrids(studentId);
        	return res;
    	}
        
}
