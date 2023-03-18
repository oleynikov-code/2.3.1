package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/users")
public class UsersControllers {

    private UserService userService;
    @Autowired
    public UsersControllers(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String getAllUser(Model model){
        model.addAttribute("allUsers",userService.getAllUsers());
        return "getAllUsers";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") int id, Model model){
        model.addAttribute("user_by_id",userService.getUser(id));
        return "byId";
    }

    @GetMapping("/new")
    public String newUser(Model model){
        model.addAttribute("newUser", new User());
        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    @GetMapping("/{id}/edit")
    public String editUser(Model model, @PathVariable("id") int id){
        model.addAttribute("user",userService.getUser(id));
        return "edit";
    }
    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user){
        userService.updateUser(user);
        return "redirect:/users";
    }
    @DeleteMapping("/{id}")
    public  String deleteUser(@PathVariable("id") int id ){
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
