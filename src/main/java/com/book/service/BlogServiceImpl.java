package com.book.service;

import com.book.entity.Blog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: 一点点
 * @Date: 2018/11/25 9:27
 * @Version 1.0
 */
@Service
public class BlogServiceImpl implements BlogService {
    List<Blog> list = new ArrayList<>();
    @Override
    public List<Blog> getBlogs() {
        list.add(new Blog(1L,"jie","beautiful"));
        list.add(new Blog(2L,"yu","pertty"));
        return list;
    }

    @Override
    public void deleteBlogs(long id) {

        Iterator iter = list.iterator();
        while (iter.hasNext()){
            Blog blog = (Blog) iter.next();
            if(blog.getId() == id){
                iter.remove();
            }
        }

    }
}
