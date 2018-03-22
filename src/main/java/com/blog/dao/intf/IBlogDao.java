package com.blog.dao.intf;

import java.util.List;

import com.blog.domain.Blog;


public interface IBlogDao {

	int deleteByPrimaryKey(Integer id);

	int insert(Blog record);

	Blog selectByPrimaryKey(Integer id);

	int updateByPrimaryKey(Blog record);
	
	List<Blog> selectAll();
	
    public Blog preBlog(Integer blogId);

    public Blog nextBlog(Integer blogId);
    
    public void updateBlogHits(Integer blogId);
}
