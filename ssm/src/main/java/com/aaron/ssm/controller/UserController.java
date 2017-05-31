package com.aaron.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aaron.ssm.model.User;
import com.aaron.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
    	User user = new User();
    	user.setUserName(request.getParameter("userName"));
    	user.setPassword("password");
    	user.setAge(10);
    	
        userService.insert(user);

        model.addAttribute("user", user);
        return "User";
    }
}
