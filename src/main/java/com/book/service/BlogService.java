package com.book.service;

import com.book.entity.Blog;

import java.util.List;

/**
 * @Author: 一点点
 * @Date: 2018/11/25 9:26
 * @Version 1.0
 */
public interface BlogService {

    List<Blog> getBlogs();

    void deleteBlogs(long id);
}
