package com.blog.service.intf;

import java.util.List;

import com.blog.domain.Blog;

public interface IBlogService {

	int deleteByPrimaryKey(Integer blogId);

	int insert(Blog record);

	Blog selectByPrimaryKey(Integer blogId);

	int updateByPrimaryKey(Blog record);
	
	List<Blog> selectAll();
	/**
	 * 上一条博客
	 */
    public Blog preBlog(Integer blogId);
    /**
	 * 下一条博客
	 */
    public Blog nextBlog(Integer blogId);
    /**
	 * 更新访问次数
	 */
    public void updateBlogHits(Integer blogId);
}
