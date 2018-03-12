package com.blog.dao.intf;

import com.blog.domain.User;

public interface IUserDao {

	int insert(User record);

	public User selectByPrimaryKey(Long id);

	int updateByPrimaryKey(User record);
	
    int deleteByPrimaryKey(Long id);

}
