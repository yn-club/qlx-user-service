package com.qlx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qlx.domain.pojo.User;
import com.qlx.http.ResponseBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

@Controller
@RequestMapping("user")
public class UserController {


    @Autowired
    private UserService userService;



    @ResponseBody
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResponseBO selectById(@PathVariable("id") Integer id){
        return ResponseBO.responseOK().setData(userService.selectByUserId(id));
    }
}
