package com.blog.service.intf;

import java.util.List;

import com.blog.domain.Blog;

public interface IBlogService {

	int deleteByPrimaryKey(Integer blogId);

	int insert(Blog record);

	Blog selectByPrimaryKey(Integer blogId);

	int updateByPrimaryKey(Blog record);
	
	List<Blog> selectAll();
	
    public Blog preBlog(Integer blogId);

    public Blog nextBlog(Integer blogId);
    
    public void updateBlogHits(Integer blogId);
}
