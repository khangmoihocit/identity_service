package com.khangpham.demoSpringboot.controller;

//controller

/*
*@RestController : return String
@RequestMapping("/user") : return html
* */

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getAlluser")
    public String getAlluser(){
        return "getAlluser";
    }

    @GetMapping("/add")
    //@RequestParam: nhan tham so tren trinh duyet
    public String add(@RequestParam("username") String username, @RequestParam int gpa){
        return "hello get add " + username + "\ngpa : " + gpa;
    }

    //@PathVariable: truyen tham so
    @GetMapping("/getTest/{id}/{username}")
    public String getTest(@PathVariable("id") int id, @PathVariable() String username){
        return "khang" + id + " " + username;
    }

    //@RequestBody: truyen tham so doi tuong
//    @PostMapping("/update")
//    public String updateUser1(@RequestBody User user) {
//        return "hello : " + user.getUsername() + user.getPassword();
//    }
    @PostMapping("/update")
    public String updateUser(@RequestBody List<User> listUser){
        for (User data : listUser){
            System.out.println("Name: " + data.getUsername() + " Password: " + data.getPassword());
        }
        return "";
    }


























}
