package com.josh.post.repository;

import com.josh.post.entity.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class PostRepositoryImpl implements PostRepository{

    private final JpaPostRepository jpaPostRepository;

    @Override
    public Post save(Post post) {
        return jpaPostRepository.save(post);
    }

    @Override
    public List<Post> findAll() {
        return jpaPostRepository.findAll();
    }
}
