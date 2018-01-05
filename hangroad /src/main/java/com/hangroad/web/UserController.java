package com.hangroad.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hangroad.entity.User;
import com.hangroad.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String  user() {
		return "user";
	}
	
	@RequestMapping("findByName/{name}")
	@ResponseBody
	public String findByName(@PathVariable("name") String userName) {
		User user = userService.findByUserName(userName);
		return user.getPassword();
	}
	
}
