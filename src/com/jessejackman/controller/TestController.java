package com.jessejackman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jessejackman.model.TestJson;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = "/json/{name}", method = RequestMethod.GET)
	@ResponseBody
	public TestJson testJSON(@PathVariable String name) {
		TestJson json = new TestJson();
		json.setParam(name);
		return json;
	}

	@RequestMapping(value = "/jsp/{name}", method = RequestMethod.GET)
	public ModelAndView testJSP(@PathVariable String name) {
		ModelAndView modelAndView = new ModelAndView("list");
		modelAndView.addObject("name", name);
		return modelAndView;
	}

}
