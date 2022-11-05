package com.blog.blogapp.controller;

import com.blog.blogapp.DTO.blogDto;
import com.blog.blogapp.entity.Blog;
import com.blog.blogapp.repository.BlogRepository;
import com.blog.blogapp.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/blog")
public class BlogController {

    private final BlogService service;

    @PostMapping("/add")
    public Blog addBlog(@RequestBody blogDto blog){
        return service.createBlog(blog);
    }

    @GetMapping("/blogs")
    public List<Blog> fetchBlog(){
        return service.getAllBlogs();
    }

    @GetMapping("/view/{id}")
    public Blog getBlog(@PathVariable int id){
       return service.getBlog(id);
    }

    @GetMapping("viewByUser/{userid}")
    public List<Blog> getBlogByuser(@PathVariable String userid){
        return service.getBlogByUser(userid);
    }
}
