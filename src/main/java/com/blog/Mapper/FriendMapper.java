package com.blog.Mapper;

import com.blog.domain.Friend;

public interface FriendMapper {
    int deleteByPrimaryKey(String fId);

    int insert(Friend record);

    int insertSelective(Friend record);

    Friend selectByPrimaryKey(String fId);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}