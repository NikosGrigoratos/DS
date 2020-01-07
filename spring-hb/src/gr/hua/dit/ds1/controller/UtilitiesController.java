package gr.hua.dit.ds1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilitiesController {
	@GetMapping("/utilities")
	public String showLogin() {
		return "utilities";
	}
}
