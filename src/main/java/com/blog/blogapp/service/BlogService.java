package com.blog.blogapp.service;

import com.blog.blogapp.DTO.blogDto;
import com.blog.blogapp.entity.Blog;
import com.blog.blogapp.entity.User;
import com.blog.blogapp.repository.BlogRepository;
import com.blog.blogapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static java.util.Collections.reverse;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;
    private final UserRepository userRepository;
    public Blog createBlog(blogDto blog){
        Blog blog1 = new Blog();
        User user = userRepository.findById(blog.getBlogUserid()).orElse(null);
        blog1.setBlogUser(user.getUsername());
        blog1.setBlogtitle(blog.getBlogtitle());
        blog1.setBlogUserid(blog.getBlogUserid());
        blog1.setBlogcontent(blog.getBlogcontent());
        if (blog.getBlogfile()=="null"){
            blog1.setBlogfile("null");
        }
        else {
            blog1.setBlogfile(blog.getBlogfile());
        }
        Date d1 = new Date();
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY hh:mm a");
        String formattedDate = df.format(d1);
        blog1.setBlogtime(formattedDate);
        return blogRepository.save(blog1);
    }

    public Blog getBlog(int id){
        return blogRepository.findById(id).orElse(null);
    }

    public List<Blog> getAllBlogs(){
        return blogRepository.findAll();
    }

    @Transactional
    public List<Blog> getBlogByUser(String id){
        return blogRepository.findByblogUserid(id);
    }
}
