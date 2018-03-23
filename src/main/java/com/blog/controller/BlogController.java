package com.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blog.domain.Blog;
import com.blog.service.intf.IBlogService;
/**
 * 博客
 * 
 * @author 17051548
 *
 */
@Controller
public class BlogController {

	private static final Logger logger = LoggerFactory.getLogger(BlogController.class);

	@Autowired
	private IBlogService blogService;
	/**
	 * 获取博客详细信息
	 * @param blogId
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/getblogdetail")
	public ModelAndView getBlogDetail(Integer blogId) {
		ModelAndView mv = new ModelAndView();
		Blog blog = blogService.selectByPrimaryKey(blogId);
		Blog preblog = blogService.preBlog(blogId);
		Blog nextblog = blogService.nextBlog(blogId);
		mv.addObject("blog", blog);
		if (null != preblog) {
			mv.addObject("preblog", preblog);
		}
		if (null != nextblog) {
			mv.addObject("nextblog", nextblog);
		}
		mv.setViewName("blogdetail");
		blogService.updateBlogHits(blogId);
		return mv;
	}
}
