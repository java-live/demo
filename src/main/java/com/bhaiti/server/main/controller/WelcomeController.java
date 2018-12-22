package com.bhaiti.server.main.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.server.main.Person;
import com.bhaiti.server.main.beans.Welcome;
@Controller
public class WelcomeController {
private static final String welcomemsg = "Welcome Mr. %s!";
   


    @GetMapping("/welcome/user")
    @ResponseBody
    public Person welcomeUser(
    		@RequestParam(name="name", required=false, defaultValue="Java Fan")
    		String name,	@RequestParam(name="age", required=false, defaultValue="24")
    		int age) {
     Person p = new Person();
     p.setAge(age);
     p.setName(name);
    	
        return   p;
    }
}