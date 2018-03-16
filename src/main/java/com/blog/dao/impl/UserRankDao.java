package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.intf.IUserRankDao;
import com.blog.domain.UserRank;

@Repository
public class UserRankDao extends BaseDao implements IUserRankDao {

	@Override
	public int insert(UserRank record) {
		return sessionTemplate.insert("com.blog.Mapper.UserRankMapper.insert", record);
	}

	@Override
	public UserRank selectByPrimaryKey(Long id) {
		return sessionTemplate.selectOne("com.blog.Mapper.UserRankMapper.selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKey(UserRank record) {
		return sessionTemplate.update("com.blog.Mapper.UserRankMapper.updateByPrimaryKey", record);
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		return sessionTemplate.delete("com.blog.Mapper.UserRankMapper.deleteByPrimaryKey", id);
	}

}
