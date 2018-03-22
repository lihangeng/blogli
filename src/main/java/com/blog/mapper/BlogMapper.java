package com.blog.mapper;

import java.util.List;

import com.blog.domain.Blog;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog record);

    int insertSelective(Blog record);

    Blog selectByPrimaryKey(Integer id);
    
    List<Blog> selectAll();

    int updateByPrimaryKeySelective(Blog record);

    int updateByPrimaryKeyWithBLOBs(Blog record);

    int updateByPrimaryKey(Blog record);
    
    public Blog preBlog(Integer blogId);

    public Blog nextBlog(Integer blogId);
    
    public void updateBlogHits(Integer blogId);
}