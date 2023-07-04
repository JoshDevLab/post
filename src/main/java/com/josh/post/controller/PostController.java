package com.josh.post.controller;

import com.josh.post.dto.PostDto;
import com.josh.post.entity.Post;
import com.josh.post.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/post-service")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Post> registerPost(@RequestBody PostDto postDto) {
        return ResponseEntity.ok(postService.registerBoard(postDto));
    }

    @GetMapping
    public String getPosts() {
        return "접근됨";
        //return ResponseEntity.ok(postService.getPosts());
    }
}
