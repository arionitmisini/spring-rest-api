package com.springrestapi.demo.controller;

import com.springrestapi.demo.BlogMockedData;
import com.springrestapi.demo.models.Blog;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {

    BlogMockedData blogMockedData = BlogMockedData.getInstance();

    @GetMapping("/blog")
    public List<Blog> index() {
        return blogMockedData.fetchBlogs();
    }

    @GetMapping("/blog/{id}")
    public Blog show(@PathVariable int id) {
        return blogMockedData.getBlogById(id);
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String, String> body) {
        String searchTerm = body.get("text");
        return blogMockedData.searchBlogs(searchTerm);
    }

}