package app.entities;

import java.util.Objects;

public class Post {

    private int id;
    private String author;
    private String title;
    private String postText;
    private String postDate;

    public Post(){
    }

    public Post(String author, String title, String postText){
        this.author = author;
        this.title = title;
        this.postText = postText;
    }

    public Post(int id, String author, String title, String postText){
        this.id = id;
        this.author = author;
        this.title = title;
        this.postText = postText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title) &&
                Objects.equals(postText, post.postText);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, postText);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", postName='" + title + '\'' +
                ", postText='" + postText + '\'' +
                ", postDate='" + postDate + '\'' +
                '}';
    }
}
