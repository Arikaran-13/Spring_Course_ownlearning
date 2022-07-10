package com.arikaran;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexServletController {
	
     @RequestMapping("index")
    // @ResponseBody
	public String index(String name,HttpSession session) {
    	 System.out.println("HEllo world");
    	 session.setAttribute("username", name);
		return "index.jsp";
	}
}
