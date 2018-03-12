package com.blog.dao.impl;

import com.blog.dao.intf.IFriendDao;
import com.blog.domain.Friend;

public class FriendDao extends BaseDao implements IFriendDao {

	@Override
	public int deleteByPrimaryKey(String fId) {
		return 0;
	}

	@Override
	public int insert(Friend record) {
		return 0;
	}

	@Override
	public Friend selectByPrimaryKey(String fId) {
		return null;
	}

	@Override
	public int updateByPrimaryKey(Friend record) {
		return 0;
	}

}
