package com.book.controller;

import com.book.entity.Blog;
import com.book.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: 一点点
 * @Date: 2018/11/25 9:34
 * @Version 1.0
 */
@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("/blogs")
    public ModelAndView list(Model model){
        List<Blog> list = blogService.getBlogs();
        model.addAttribute("blogsList",list);
        return new ModelAndView("/blogs/list","blogModel",model);
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/{id}/delete")
    public ModelAndView delete(@PathVariable("id") Long id,Model model){
        blogService.deleteBlogs(id);
        model.addAttribute("blogsList", blogService.getBlogs());
        return new ModelAndView("/blogs/list","blogModel",model);
    }

}
