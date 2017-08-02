package com.lxzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginpage() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("login");

		return mv;
	}
}
