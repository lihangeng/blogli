package com.blog.dao;

import com.blog.domain.UserRank;

public interface IUserRankDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserRank record);

    int insertSelective(UserRank record);

    UserRank selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRank record);

    int updateByPrimaryKey(UserRank record);
}