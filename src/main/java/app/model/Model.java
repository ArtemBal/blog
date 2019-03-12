package app.model;

import app.entities.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<Post> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(Post post) {
        model.add(post);
    }

    public List<String> list() {
        return model.stream()
                .map(Post::getPostName)
                .collect(Collectors.toList());
    }
}
