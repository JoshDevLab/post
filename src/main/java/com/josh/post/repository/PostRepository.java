package com.josh.post.repository;

import com.josh.post.entity.Post;

import java.util.List;

public interface PostRepository {
    Post save(Post post);
    List<Post> findAll();
}
