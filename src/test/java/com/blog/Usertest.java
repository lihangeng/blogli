package com.blog;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.dao.intf.IFriendDao;
import com.blog.domain.Blog;
import com.blog.domain.User;
import com.blog.service.intf.IBlogService;
import com.blog.service.intf.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Usertest {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IBlogService blogService;
	
	@Autowired
	private IFriendDao friendDao;

	@Test
	public void testQueryUserById() {
		User user = userService.selectByPrimaryKey(1L);
//		userService.deleteByPrimaryKey(1L);
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
	}
	
//	@Test
//	public void testBlogService() {
//		List<Blog> blogs = blogService.selectAll();
//	}
	
//	@Test
//	public void testFriendService() {
//		friendDao.selectByPrimaryKey("1");
//	}
	
	
}
