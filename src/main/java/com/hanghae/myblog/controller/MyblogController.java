package com.hanghae.myblog.controller;

import com.hanghae.myblog.domain.Blog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @GetMapping("/blogs")
    public <Blogs> Blogs getBlogs() {
        Blog blos = new Blog();

    }

}
