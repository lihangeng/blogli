package com.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.domain.User;
import com.blog.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Usertest {
	
	@Autowired
	private IUserService userService;

	@Test
	public void testQueryUserById() {
		User user = userService.selectByPrimaryKey(1L);
		userService.deleteByPrimaryKey(1L);
		System.out.println(user.getUserId());
		System.out.println(user.getUserName());
	}
}
