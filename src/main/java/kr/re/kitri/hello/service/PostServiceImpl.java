package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.PostRepository;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts(){
        return postRepository.selectAllPosts();
    }

    @Override
    public void putPost(Post post) {
        postRepository.insertPost(post);
    }
}
