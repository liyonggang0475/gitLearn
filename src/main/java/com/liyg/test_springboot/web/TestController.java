package com.liyg.test_springboot.web;

import com.liyg.test_springboot.model.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author liyg
 */
@RestController
public class TestController {
    @RequestMapping("hello")
    public  String  hello(String name){
        return "hello" + name;
    }

    @RequestMapping("getUser")
    public User getUser(){
        User user = new User();
        user.setAge(11);
        user.setName("liyg");
        user.setPassword("12345");

        return user;
    }

    @PostMapping("/saveUser")
    public  void saveUser(@Valid User user, BindingResult result){
        System.out.println(user.toString());
        if(result.hasErrors()){
            System.out.println(result.getAllErrors().toString());
            List<ObjectError> errors =  result.getAllErrors();
            errors.forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
        }
        else{
            System.out.println("save sucess");
        }
    }
}