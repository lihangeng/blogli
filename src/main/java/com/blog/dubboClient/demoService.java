package com.blog.dubboClient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.blog.domain.Blog;
import com.blog.service.intf.IBlogService;

public class demoService {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/consumer.xml");
		context.start();
		IBlogService blogService = (IBlogService)context.getBean("blogServiceImpl");
		Blog blog = blogService.selectByPrimaryKey(1);
		System.out.println(blog.getContext());
	}

}
