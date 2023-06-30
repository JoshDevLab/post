package com.josh.post.domain.controller;

import com.josh.post.domain.dto.PostDto;
import com.josh.post.domain.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Integer> registerPost(@RequestBody PostDto postDto) {
        log.info("postDto {}", postDto);
        PostDto rePostDto = postService.registerBoard(postDto);
        if (rePostDto == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(1);
    }

    @GetMapping
    public ResponseEntity<List<PostDto>> getPosts() {
        return ResponseEntity.ok(postService.getPosts());
    }
}
