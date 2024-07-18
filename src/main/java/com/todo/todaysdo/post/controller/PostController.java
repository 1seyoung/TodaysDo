package com.todo.todaysdo.post.controller;

import com.todo.todaysdo.post.dto.PostRequestDto;
import com.todo.todaysdo.post.dto.PostResponseDto;
import com.todo.todaysdo.post.sevice.PostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class PostController {

    //제어 흐름 MemoController -> MemoService -> MemoRepository : 강한 결합

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/post")
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    @GetMapping("/post")
    public List<PostResponseDto> getPost(){
        return postService.getPost();
    }

    @PutMapping("/post/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.updatePost(id, requestDto);
    }

    @GetMapping("/post/{id}")
    public PostResponseDto getPostById(@PathVariable Long id) {
        return  postService.getPostById(id);
    }


    @DeleteMapping("/post/{id}")
    public long deletePost(@PathVariable Long id){
        return  postService.deletePost(id);
    }

}
