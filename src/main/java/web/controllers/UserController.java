package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.dao.UserDAOImpl;
import web.models.User;

@Controller
public class UserController {

    private final UserDAOImpl userdao;

    public UserController(UserDAOImpl userdao) {
        this.userdao = userdao;
    }

    @GetMapping("/users")
    public String index(Model model) {
        model.addAttribute("users", userdao.index());
        return "users";
    }

    @GetMapping("/new")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping("/users")
    public String create(@ModelAttribute("user") User user) {
        userdao.save(user);
        return "redirect:/users";
    }
}
