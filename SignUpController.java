package com.example.Website.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.example.Website.domain.StudentUser;
import com.example.Website.domain.User;
import com.example.Website.service.UserServiceLayer;

//import ch.qos.logback.core.model.Model;

@Controller
public class SignUpController {
	@Autowired
	UserServiceLayer userService;
	@RequestMapping("/signUp")
	public String getSignUpPage(Model uiModel) {
		 User user = userService.getUser();
		 uiModel.addAttribute("user", user);
		       return "signup";
	}
	
	@RequestMapping("/registerUser")
	public String createdUser(@ModelAttribute(value = "user") StudentUser studentUser) {
		if(userService.signup(studentUser.getName(),studentUser.getGender(),
				studentUser.getLocation(),studentUser.getCollege())) {
			return "registerUser";
		}
		return "signup";
	}
}
