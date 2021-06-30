package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//기존 컨트롤러에 레스트가 추가된
@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello(){
        return "안녕하세요, Hello World";
    }

    @GetMapping("/hello")
    public String getAllPosts(){
        return "<b>전체 글 입니다.</b>";
    }

    // 과제.. /posts/3
    @GetMapping("/posts/3")
    public String getAllPosts3(){
        return "<b>3번 글 상세보기 입니다.</b>";
    }

}
