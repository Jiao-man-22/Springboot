package com.jiao.bootmybatis.controller;
import com.jiao.bootmybatis.pojo.User;
import com.jiao.bootmybatis.services.addUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private addUserService addUserService;
    @RequestMapping("/addUser")
    public String addUser(User user){
        try{
            System.out.println("提交人名字为："+user.getName());
        this.addUserService.addUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "redirect:ok";
    }
    @RequestMapping("/ok")
    public String ok(){
        return "ok";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(User user){
    try {
        System.out.println("用户的id:"+user.getId());
        System.out.println("用户的name:"+user.getName());
        boolean b = this.addUserService.deleteUser(user);
        System.out.println(b);
    }catch (Exception e){
        e.printStackTrace();
        return "error";
    }
        return "ok";
    }
    @RequestMapping("/findUserAll")
    public String findUserAll(Model model){
        try {
            List<User> userAll = this.addUserService.findUserAll();
            System.out.println(userAll);
            model.addAttribute("list",userAll);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showUser";
    }
    @RequestMapping("/updateUser")
    public String updateUser(User user){
        try {
            this.addUserService.updateUser(user);
        }catch (Exception e){
            e.printStackTrace();

            return "error";
        }
        return "ok";
    }
    //查找一个用户
    @RequestMapping("/findOne")
    public String findOne(User user,Model model){
        try {
            User one = this.addUserService.findOne(user);
            model.addAttribute("user",one);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        return "showOne";
    }
}

