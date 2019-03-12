package app.entities;

import java.util.Objects;

public class Post {

    private int id;
    private String author;
    private String postName;
    private String postText;
    private String postDate;

    public Post(){
    }

    public Post(String Author, String PostName, String postText){
        this.author = Author;
        this.postName = PostName;
        this.postText = postText;
    }

    public Post(int id, String Author, String PostName, String postText){
        this.id = id;
        this.author = Author;
        this.postName = PostName;
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

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
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
        return Objects.equals(postName, post.postName) &&
                Objects.equals(postText, post.postText);
    }

    @Override
    public int hashCode() {

        return Objects.hash(postName, postText);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", postName='" + postName + '\'' +
                ", postText='" + postText + '\'' +
                ", postDate='" + postDate + '\'' +
                '}';
    }
}
