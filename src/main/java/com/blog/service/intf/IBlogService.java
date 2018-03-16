package com.blog.service.intf;

import java.util.List;

import com.blog.domain.Blog;

public interface IBlogService {

	int deleteByPrimaryKey(Long id);

	int insert(Blog record);

	Blog selectByPrimaryKey(Long id);

	int updateByPrimaryKey(Blog record);
	
	List<Blog> selectAll();
}
