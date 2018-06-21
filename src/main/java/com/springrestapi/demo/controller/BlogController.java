package com.springrestapi.demo.controller;

import com.springrestapi.demo.models.Blog;
import com.springrestapi.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/blog")
    public List<Blog> index(){
        return blogRepository.findAll();
    }

    @GetMapping("/blog/{id}")
    public Optional<Blog> show(@PathVariable int id){
        return blogRepository.findById(id);
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return blogRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    /*@GetMapping("/blog")
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

    @PostMapping("/blog")
    public Blog create(@RequestBody Map<String, String> body) {

        int id = Integer.parseInt(body.get("id"));
        String title = body.get("title");
        String content = body.get("content");

        return blogMockedData.createBlog(id, title, content);

    }

    @PutMapping("/blog/{id}")
    public Blog update(@PathVariable String id, @RequestBody Map<String, String> body) {
        int blogId = Integer.parseInt(id);
        String title = body.get("title");
        String content  = body.get("content");

        return blogMockedData.updateBlog(blogId, title, content);

    }
*/
}