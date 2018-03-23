package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.impl.BlogDao;
import com.blog.domain.Blog;
import com.blog.service.intf.IBlogService;

@Service
public class BlogServiceImpl implements IBlogService {
	
	@Autowired
	private BlogDao blogDao;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return blogDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Blog record) {
		return blogDao.insert(record);
	}

	@Override
	public Blog selectByPrimaryKey(Integer id) {
		return blogDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKey(Blog record) {
		return blogDao.updateByPrimaryKey(record);
	}

	@Override
	public List<Blog> selectAll() {
		return blogDao.selectAll();
	}

	@Override
	public Blog preBlog(Integer blogId) {
		return blogDao.preBlog(blogId);
	}

	@Override
	public Blog nextBlog(Integer blogId) {
		return blogDao.nextBlog(blogId);
	}

	@Override
	public void updateBlogHits(Integer blogId) {
		blogDao.updateBlogHits(blogId);		
	}

}
