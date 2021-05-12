package model;

import user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {
    private static Model instance = new Model();
    private Map<Integer, User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new HashMap<>();
    }

    public void add(Integer integer, User user) {
        model.put(integer, user);
    }

    public Map<Integer, User> get() {
        return model;
    }

}
