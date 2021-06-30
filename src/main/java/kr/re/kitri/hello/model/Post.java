package kr.re.kitri.hello.model;

import jdk.jfr.DataAmount;

public class Post {
    private int postId;
    private String title;
    private String author;
    private String body;
    private long like;


    public Post(int postId, String title, String author, String body, long like) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.body = body;
        this.like = like;
    }

    public int getPostId() {
        return postId;
    }
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public long getLike() {
        return like;
    }
    public void setLike(long like) {
        this.like = like;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", like=" + like +
                '}';
    }
}
