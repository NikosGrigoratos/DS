package gr.hua.dit.ds1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.ds1.dao.CompanyApplicationDAO;
import gr.hua.dit.ds1.entity.CompanyApplication;

@Controller
@RequestMapping("/companyApps")
public class CompanyApplicationController {
	
	@Autowired
    private CompanyApplicationDAO companyAppsDAO;
	
	@RequestMapping("/list")
    public String listCompanyApps(Model model) {
		List<CompanyApplication> companyApps = companyAppsDAO.getCompanyApps();
        
        // add the customers to the model
        model.addAttribute("CompanyApps", companyApps);
        	
            return "list-company-apps";
    }
	
	@RequestMapping("/add")
	public String addCompanyAppForm() {
		return "add-company-app-form";
	}
	
	@RequestMapping("/delete")
	public String removeCompanyAppForm() {
		return "remove-company-app-form";
	}
	
	@RequestMapping("/addProcess")
	public String addCompanyApp(HttpServletRequest request, Model model) {
		String theApp = request.getParameter("companyAppToAdd");
		companyAppsDAO.addCompanyApp(theApp);
		return null;
	}
	
	@RequestMapping("/deleteProcess")
	public String deleteCompanyApp(HttpServletRequest request, Model model) {
		String theApp = request.getParameter("companyAppToDel");
		companyAppsDAO.deleteCompanyApp(theApp);
		return null;
	}
}
