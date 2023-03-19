package kr.megaptera.assignment.dtos;

import kr.megaptera.assignment.models.Post;

public class PostDto {
    private String id;
    private String author;
    private String title;
    private String content;

    public PostDto() {
    }

    public PostDto(Post post){
        this(post.id().toString(), post.author(), post.title(), post.content());
    }

    public PostDto(String id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
