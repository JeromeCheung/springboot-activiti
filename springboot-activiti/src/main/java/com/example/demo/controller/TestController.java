package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	public ModelAndView buildView(String viewName) {
		return new ModelAndView(viewName);
	}
	 
	//这里指定是条状的jsp界面  
    @RequestMapping(value = "/index")  
    public ModelAndView index() { 
    	ModelAndView view = buildView("index");
    	view.addObject("hello", "from TemplateController.helloHtml");
        return view;  
    }  
    
}
