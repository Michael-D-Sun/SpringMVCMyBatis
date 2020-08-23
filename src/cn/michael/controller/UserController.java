package cn.michael.controller;

import cn.michael.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public String users(ModelMap map){
        map.addAttribute("users", userService.selectAll());
        return "index.jsp";
    }
}
