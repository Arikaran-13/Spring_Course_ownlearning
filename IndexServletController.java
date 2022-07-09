package com.arikaran;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexServletController {
	
	@RequestMapping("index")
	
	public String index() {
		System.out.println("Hello");
		return "index.jsp";
	}

}
