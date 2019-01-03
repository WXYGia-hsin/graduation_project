package com.wxy.blog.controller;

import com.wxy.blog.entity.Authority;
import com.wxy.blog.entity.User;
import com.wxy.blog.service.AuthorityService;
import com.wxy.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

/**
 * 主页控制器
 */
@Controller
public class MainController {
    private static final Long ROLE_USER_AUTHORITY_ID = 2L;

    @Autowired
    private UserService userService;
    @Autowired
    private AuthorityService authorityService;
    @GetMapping()
    public String root(){
        return "redirect:/index";
    }
    @GetMapping("/index")
    public String index(){
        return "index.html";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登陆失败!用户名或密码错误");
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
    @PostMapping("/register")
    public String registerUser(User user){
        List<Authority> authorityList=new ArrayList<>();
        authorityList.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID));
        user.setAuthorities(authorityList);
        userService.saveOrupdateUser(user);
        return "redirect:/login";
    }
    @GetMapping("/search")
    public String search(){
        return "search";
    }

}
