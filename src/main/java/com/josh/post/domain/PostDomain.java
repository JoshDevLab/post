package com.josh.post.domain;

import com.josh.post.dto.PostDto;
import com.josh.post.entity.Post;

import java.util.List;
import java.util.stream.Collectors;

public class PostDomain {

    public List<PostDto> getCollect(List<Post> posts) {
        return posts.stream().map(PostDto::new).collect(Collectors.toList());
    }
}
