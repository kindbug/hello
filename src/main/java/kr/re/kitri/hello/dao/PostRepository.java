package kr.re.kitri.hello.dao;



import kr.re.kitri.hello.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {

    public List<Post> selectAllPosts(){

        List<Post> list = List.of(
                new Post(1, "첫번째 글", "최충선", "",10),
                new Post(2, "첫번째 글", "최충선", "",10),
                new Post(3, "첫번째 글", "최충선", "",10),
                new Post(4, "첫번째 글", "최충선", "",10)

        );
        return list;
    }

    public void insertPost(Post post) {
        // DB 에 insert..
        System.out.println("인서트 완료 "+post);
    }
}
