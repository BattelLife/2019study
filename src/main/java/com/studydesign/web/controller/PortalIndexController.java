package com.studydesign.web.controller;


import com.studydesign.web.entity.entities.User;
import com.studydesign.web.service.PortalIndexService;
import com.studydesign.web.vo.LoginPojo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(tags = {"用户管理"})
@RequestMapping("/user")
public class PortalIndexController {



    @Autowired
    PortalIndexService portalIndexService;

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public User login(@RequestBody LoginPojo loginPojo){
        return portalIndexService.login(loginPojo.getUsername(),loginPojo.getPassword());
    }

}
