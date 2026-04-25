package com.example.demo.service;

import com.example.demo.entity.Comment;
import com.example.demo.repository.CommentRepository;
import com.example.demo.exception.CommentLimitExceededException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private StringRedisTemplate redisTemplate;

    public Comment addComment(Comment comment) {

        String key = "post:" + comment.getPostId() + ":comments";

        Long count = redisTemplate.opsForValue().increment(key);

        if (count != null && count > 10) {
            throw new CommentLimitExceededException("Comment limit exceeded!");
        }

        return commentRepository.save(comment);
    }
}