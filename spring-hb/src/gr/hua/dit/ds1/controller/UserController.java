package gr.hua.dit.ds1.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import gr.hua.dit.ds1.dao.UserDAO;
import gr.hua.dit.ds1.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    private UserDAO userDAO;
	
	@RequestMapping("/list")
	public String listUsers(Model model) {
		List<User> users = userDAO.getUsers();
		model.addAttribute("users", users);
		return "list-users";
	}
	
	@RequestMapping("/delete")
	public String removeUserForm() {
		return "remove-user-form";
	}
	
	@RequestMapping("/add")
	public String addUserForm() {
		return "add-user-form";
	}
	
	@RequestMapping("/deleteProcess")
	public String removeUser(HttpServletRequest request, Model model) {
		String theName = request.getParameter("userToDelete");
		userDAO.deleteUser(theName);
		return null;
	}
	
	@RequestMapping("/addProcess")
	public String addNewUser(HttpServletRequest request, Model model) {
		String name = request.getParameter("username");
		String pass = request.getParameter("pass");
		String fname = request.getParameter("firstName");
		String sname = request.getParameter("secondName");
		String email = request.getParameter("email");
		User user = new User(name, pass, fname, sname, email);
		System.out.println(user.toString());
		userDAO.addUser(user);
		return null;
	}
}
