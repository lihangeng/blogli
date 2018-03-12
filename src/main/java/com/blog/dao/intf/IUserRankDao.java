package com.blog.dao.intf;

import com.blog.domain.UserRank;

public interface IUserRankDao {
	
    int insert(UserRank record);
    
    UserRank selectByPrimaryKey(Long id);

    int updateByPrimaryKey(UserRank record);

    int deleteByPrimaryKey(Long id);

}
