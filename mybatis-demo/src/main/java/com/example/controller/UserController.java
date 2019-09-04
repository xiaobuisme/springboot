package com.example.controller;

import com.example.pojo.model.TUser;
import com.example.pojo.qo.UserQO;
import com.example.service.UserService;
import com.example.utils.JsonResult;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value = "用户相关接口")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    @ResponseBody
    public JsonResult<TUser> test(){
        TUser user = new TUser();
        user.setId(1);
        user.setUsername("xiaobuisme");
        user.setEmail("test@126.com");
        JsonResult result = JsonResult.okJsonResult();
        result.setData(user);
        return result;
    }

    @PostMapping("/save")
    public JsonResult<String> save(@RequestBody UserQO userQO){
        if(userQO != null){
            return JsonResult.failJsonResult();
        }
        return JsonResult.okJsonResult();
    }
}
