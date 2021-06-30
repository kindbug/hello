package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/Posts")
    public List<Post> viewAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/Posts/{postId}")
    public Post viewPostById(@PathVariable long postId){
        System.out.println(postId);
        return null;
    }

    @PostMapping("/Posts")
    public void registPost(@RequestBody Post post){

        postService.putPost(post);
    }

    public String removePost(){
        return null;
    }

    public String modifyPost(){
        return null;
    }


}
