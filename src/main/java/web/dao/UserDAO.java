package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {

    List<User> index();

    User show(Long id);

    void save(User user);

    void update(Long id, User updatedUser);

    void delete(Long id);
}
