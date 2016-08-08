package com.joern.controller;


import com.joern.model.User;
import com.joern.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class HelloController {

	@Autowired
	private UserRepository userRepository;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap modelMap) {

	    modelMap.addAttribute("message", "Spring 3 MVC Hello World");
	    modelMap.addAttribute("userList", userRepository.findAll());

        return "hello";

    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

	    User newUser = User.newUser();

	    if(name == null){
		    String[]names = {"Klaus", "Peter","Müller","Hans","Meyer",};
		    name = names[new Random().nextInt(names.length)];
	    }

	    newUser.setName(name);
	    newUser = userRepository.save(newUser);




	    ModelAndView model = new ModelAndView();
        model.setViewName("hello");
        model.addObject("msg", name);
	    model.addObject("userId", newUser.getId());




        return model;

    }

}