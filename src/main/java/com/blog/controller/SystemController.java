package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blog.domain.Blog;
import com.blog.service.intf.IBlogService;

@Controller
public class SystemController {
	
	@Autowired
	private IBlogService blogService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		List<Blog> blog = blogService.selectAll();
		return mv;
	}

}
