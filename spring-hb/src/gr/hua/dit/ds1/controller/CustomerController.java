package gr.hua.dit.ds1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.ds1.entity.Customer;
import gr.hua.dit.ds1.dao.CustomerDAO;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
    private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
    public String listCustomers(Model model) {
		List<Customer> customers = customerDAO.getCustomers();
        
        // add the customers to the model
        model.addAttribute("customers",customers);
        	
            return "list-customers";
    }
	
}
