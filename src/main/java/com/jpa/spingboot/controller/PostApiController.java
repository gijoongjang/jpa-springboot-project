package com.jpa.spingboot.controller;

import com.jpa.spingboot.dto.PostResponseDto;
import com.jpa.spingboot.dto.PostSaveRequestDto;
import com.jpa.spingboot.dto.PostUpdateRequestDto;
import com.jpa.spingboot.service.posts.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @Autowired
    private PostService postService;

    @PostMapping("/post")
    public Long save(@RequestBody PostSaveRequestDto requestDto) {
        return postService.save(requestDto);
    }

    @PutMapping("/post/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostUpdateRequestDto requestDto) {
        return postService.update(id, requestDto);
    }

    @GetMapping("/post/{id}")
    public PostResponseDto findPost(@PathVariable Long id) {
        return postService.findById(id);
    }
}
