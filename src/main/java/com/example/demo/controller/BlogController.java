package com.example.demo.controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogRepository blogRepository;

    @GetMapping
    public List<Blog> getAllPost(){
        return blogRepository.findAll();
    }

    @PostMapping("/savePost")
    public Blog getAllPost(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @GetMapping("/getOnePost/{id}")
    public String getOnePost(@PathVariable String id){
        return id;
    }

    @PutMapping("/updatePost/{id}")
    public void updatePost(@RequestBody Blog blog) {
        blogRepository.save(blog);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePost(@PathVariable int id) {
        blogRepository.deleteById(id);
    }
}
