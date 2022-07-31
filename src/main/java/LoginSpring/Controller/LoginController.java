package LoginSpring.Controller;

import LoginSpring.Model.User;
import LoginSpring.Repository.UserRepository;
import LoginSpring.Model.*;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/login")
    public String viewLoginPage(Model model)
    {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }
}
