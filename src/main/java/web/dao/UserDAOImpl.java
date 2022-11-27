package web.dao;

import org.springframework.stereotype.Component;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    private static Long COUNT = 1L;
    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(COUNT++, "Name1", "Surname1", (byte) 1));
        users.add(new User(COUNT++, "Name2", "Surname2", (byte) 2));
        users.add(new User(COUNT++, "Name3", "Surname3", (byte) 3));
        users.add(new User(COUNT++, "Name4", "Surname4", (byte) 4));
        users.add(new User(COUNT++, "Name5", "Surname5", (byte) 5));
    }

    @Override
    public List<User> index() {
        return users;
    }

    @Override
    public void save(User user) {
        user.setId(COUNT++);
        users.add(user);
    }
}
