package com.josh.post.domain.service;

import com.josh.post.domain.dto.PostDto;
import com.josh.post.domain.entity.Post;
import com.josh.post.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    /**
     * 게시판 등록 메서드
      */
    public PostDto registerBoard(PostDto postDto) {
        Post savePost = postRepository.save(postDto.toEntity());
        return new PostDto(savePost);
    }

    /**
     * 게시판 조회 메서드
     */
    public List<PostDto> getPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(PostDto::new).collect(Collectors.toList());
    }
}
