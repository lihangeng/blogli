package com.blog.dao.intf;

import com.blog.domain.Friend;

public interface IFriendDao {

	int deleteByPrimaryKey(String fId);

	int insert(Friend record);

	Friend selectByPrimaryKey(String fId);

	int updateByPrimaryKey(Friend record);
}
