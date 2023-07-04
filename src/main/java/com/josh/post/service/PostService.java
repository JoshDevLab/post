package com.josh.post.service;

import com.josh.post.domain.PostDomain;
import com.josh.post.dto.PostDto;
import com.josh.post.entity.Post;
import com.josh.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    /**
     * 게시판 등록 메서드
      */
    public Post registerBoard(PostDto postDto) {
        return postRepository.save(postDto.toEntity());
    }

    /**
     * 게시판 조회 메서드
     */
    public List<PostDto> getPosts() {
        List<Post> posts = postRepository.findAll();
        PostDomain postDomain = new PostDomain();
        return postDomain.getCollect(posts);
    }


}
