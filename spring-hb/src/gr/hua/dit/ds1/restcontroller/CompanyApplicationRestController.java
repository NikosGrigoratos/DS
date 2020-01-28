package gr.hua.dit.ds1.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.dit.ds1.dao.CompanyApplicationDAO;
import gr.hua.dit.ds1.entity.CompanyApplication;
import gr.hua.dit.ds1.entity.StudentApplication;

@RestController
@RequestMapping("/companyapp")
public class CompanyApplicationRestController {
	
	@Autowired
	CompanyApplicationDAO companyApplicationDao;
	
	@PostMapping("/addcpapp")
	public CompanyApplication addCustomer(@RequestBody CompanyApplication theApp) {
		theApp.setId(0);
		companyApplicationDao.addCompanyApp(theApp);

		return theApp;
	}
}
