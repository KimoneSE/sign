package com.htsc.sign.controller;

import com.htsc.sign.common.ResultCode;
import com.htsc.sign.common.ResultVO;
import com.htsc.sign.model.User;
import com.htsc.sign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Kimone
 * date 2020/9/1
 */
@RestController
@RequestMapping("/user")
public class SignController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResultVO register(@RequestParam String username, @RequestParam String password){
        ResultVO resultVO ;
        if(userService.findByName(username)!=null){
            resultVO = new ResultVO(ResultCode.ERROR,"该用户名已存在");
            return resultVO;
        }
        User user = new User(username, password);
        resultVO = new ResultVO(userService.createUser(user));
        return resultVO;
    }

    @PostMapping("/login")
    public ResultVO logIn(@RequestParam String username, @RequestParam String password) {
        System.out.println(username+password);

        ResultVO resultVO;
        User user = userService.findByNameAndPsw(username, password);
        if(user==null) {
            resultVO = new ResultVO(ResultCode.ERROR,"用户名或密码错误");
            return resultVO;
        }
        resultVO = new ResultVO(user);
        return resultVO;
    }
}
