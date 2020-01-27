package gr.hua.dit.ds1.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
		int result = Integer.parseInt(theName);
		userDAO.deleteUser(result);
		return "delete-done";
	}
	
	@RequestMapping("/addProcess")
	public String addNewUser(HttpServletRequest request, Model model) {
		String name = request.getParameter("username");
		String pass = request.getParameter("pass");
		String fname = request.getParameter("firstName");
		String sname = request.getParameter("secondName");
		String email = request.getParameter("email");
		String auth = request.getParameter("ROLE_USER");
		
		String encodedPass = new BCryptPasswordEncoder().encode(pass);
		
		User user = new User(name, encodedPass, fname, sname, email, auth, true);
		System.out.println(user.toString());
		userDAO.addUser(user);
		model.addAttribute("username", user.getUsername());
		return "user-added";
	}
}
