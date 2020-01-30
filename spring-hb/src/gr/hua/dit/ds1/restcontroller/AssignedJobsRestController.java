package gr.hua.dit.ds1.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.ds1.dao.AssignedJobsDAO;
import gr.hua.dit.ds1.entity.AssignedJobs;

@RestController
@RequestMapping("/assignedjobs")
public class AssignedJobsRestController {
	
	@Autowired
	AssignedJobsDAO assignedJobsDao;
	
	@GetMapping("/getjob/{studentId}")
	public AssignedJobs getAssignedJob(@PathVariable String studentId) {
		System.out.println(studentId);
		AssignedJobs res = assignedJobsDao.getAssignedJobByStudentId(studentId);
		return res;
	}
	
}
