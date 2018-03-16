package com.blog.dao.intf;

import java.util.List;

import com.blog.domain.Blog;


public interface IBlogDao {

	int deleteByPrimaryKey(Long id);

	int insert(Blog record);

	Blog selectByPrimaryKey(Long id);

	int updateByPrimaryKey(Blog record);
	
	List<Blog> selectAll();
}
