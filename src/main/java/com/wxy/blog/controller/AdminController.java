package com.wxy.blog.controller;

import com.wxy.blog.vo.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户控制器
 */
@Controller
@RequestMapping("/admins")
public class AdminController {
    /**
     *获取后台管理主页面
     * @param model
     * @return
     */
    @GetMapping
    public ModelAndView listsUsers(Model model){
        List<Menu> list = new ArrayList<>();
        list.add(new Menu("用户管理", "/users"));
        model.addAttribute("list", list);
        return new ModelAndView("/admins/index", "model", model);
    }
}
