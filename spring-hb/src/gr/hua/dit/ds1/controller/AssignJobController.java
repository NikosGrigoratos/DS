package gr.hua.dit.ds1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gr.hua.dit.ds1.dao.AssignedJobsDAO;
import gr.hua.dit.ds1.dao.CompanyApplicationDAO;
import gr.hua.dit.ds1.entity.AssignedJobs;
import gr.hua.dit.ds1.entity.CompanyApplication;

@Controller
@RequestMapping("/assignedjobs")
public class AssignJobController {
	
	@Autowired
    private CompanyApplicationDAO companyAppsDAO;
	
	@Autowired
    private AssignedJobsDAO assignedJobsDao;
	
	@GetMapping("/assign")
	public String showLogin() {
		return "assign-job";
	}
	
	@GetMapping("/assignProcess")
	public String assignJob(HttpServletRequest request, Model model) {
		
		String it = request.getParameter("studentIt");
		String compApp = request.getParameter("compAppId"); //need to pass this as an int
		
		CompanyApplication res = companyAppsDAO.getCompanyAppById(Integer.parseInt(compApp));
		String cpname = res.getCompany();
		String cpjob = res.getPosition();
		
		AssignedJobs job = new AssignedJobs(it, cpname, cpjob);
		assignedJobsDao.addToAssignedJobs(job);
		
		model.addAttribute("it", it);
		model.addAttribute("cpid", compApp);
		return "job-assigned";
	}
}
