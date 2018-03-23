package com.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blog.dao.impl.BlogDao;
import com.blog.domain.Blog;
import com.blog.domain.BlogCategory;
import com.blog.service.intf.IBlogCategoryService;
import com.blog.service.intf.IBlogService;

@Service
public class BlogServiceImpl implements IBlogService {

	@Autowired
	private BlogDao blogDao;

	private IBlogCategoryService blogCategoryService;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return blogDao.deleteByPrimaryKey(id);
	}

	/**
	 * 插入一条博客，并且在博客分类+1
	 * 
	 * @param record
	 * @return
	 */
	@Override
	@Transactional
	public int insert(Blog record) {
		BlogCategory blogCategory;
		if (null != record.getCategoryId()) {
			blogCategory = blogCategoryService.selectByPrimaryKey(record.getCategoryId());
			blogCategory.setcNum(blogCategory.getcNum() + 1);
			blogCategoryService.updateByPrimaryKey(blogCategory);
		}
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

	/**
	 * 上一条博客
	 */
	@Override
	public Blog preBlog(Integer blogId) {
		return blogDao.preBlog(blogId);
	}

	/**
	 * 下一条博客
	 */
	@Override
	public Blog nextBlog(Integer blogId) {
		return blogDao.nextBlog(blogId);
	}

	/**
	 * 更新访问次数
	 */
	@Override
	public void updateBlogHits(Integer blogId) {
		blogDao.updateBlogHits(blogId);
	}

}
