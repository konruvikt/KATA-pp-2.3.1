package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {

    List<User> index();

    void save(User user);
}
