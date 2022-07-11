package com.arikaran;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexServletController {
    @RequestMapping("/index")
   // @ResponseBody
	public ModelAndView index(@RequestParam("name")String uname,HttpSession session) {
		
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("username",uname);
    	mav.setViewName("index");
    	session.setAttribute("username", uname);
		//return "index"; //separation of concern
    	return mav;
	}
}
