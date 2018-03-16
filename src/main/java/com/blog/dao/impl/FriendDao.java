package com.blog.dao.impl;

import org.springframework.stereotype.Repository;

import com.blog.dao.intf.IFriendDao;
import com.blog.domain.Friend;

@Repository
public class FriendDao extends BaseDao implements IFriendDao {

	@Override
	public int deleteByPrimaryKey(String fId) {
		return sessionTemplate.delete("com.blog.Mapper.BlogMapper.deleteByPrimaryKey", fId);
	}

	@Override
	public int insert(Friend record) {
		return sessionTemplate.insert("com.blog.Mapper.BlogMapper.insert", record);
	}

	@Override
	public Friend selectByPrimaryKey(String fId) {
		return sessionTemplate.selectOne("com.blog.Mapper.BlogMapper.selectByPrimaryKey", fId);
	}

	@Override
	public int updateByPrimaryKey(Friend record) {
		return sessionTemplate.update("com.blog.Mapper.BlogMapper.updateByPrimaryKey", record);
	}

}
