package com.blog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blog.domain.Blog;
import com.blog.service.intf.IBlogCategoryService;
import com.blog.service.intf.IBlogService;

/**
 * 系统
 * 
 * @author 17051548
 *
 */
@Controller
public class SystemController {
	
	private static final Logger logger = LoggerFactory.getLogger(SystemController.class);
	
	@Autowired
	private IBlogService blogService;
	
	@Autowired
	private IBlogCategoryService blogCategoryService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		logger.info("显示主页");
		ModelAndView mv = new ModelAndView();
		List<Blog> blogs = blogService.selectAll();
		for(Blog blog : blogs) {
			blog.setBlogCategory(blogCategoryService.selectByPrimaryKey(blog.getCategoryId()));
		}
		mv.addObject("blogs", blogs);
		return mv;
	}

}
