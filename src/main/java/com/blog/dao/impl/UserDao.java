package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.intf.IUserDao;
import com.blog.domain.User;

@Repository
public class UserDao extends BaseDao implements IUserDao {

	public User selectByPrimaryKey(Long id) {
		return (User) sessionTemplate.selectOne("com.blog.Mapper.UserMapper.selectByPrimaryKey", id);
	}

	@Override
	public int insert(User record) {
		return sessionTemplate.insert("com.blog.Mapper.UserMapper.insert", record);
	}

	@Override
	public int updateByPrimaryKey(User record) {
		return sessionTemplate.update("com.blog.Mapper.UserMapper.updateByPrimaryKey", record);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sessionTemplate.delete("com.blog.Mapper.UserMapper.deleteByPrimaryKey", id);
	}

}
