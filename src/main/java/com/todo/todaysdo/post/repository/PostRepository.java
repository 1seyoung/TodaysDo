package com.todo.todaysdo.post.repository;

import com.todo.todaysdo.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component // Spring Bean 으로 등록
public interface PostRepository extends JpaRepository<Post, Long> {

}