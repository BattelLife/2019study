package com.studydesign.web.controller;


import com.studydesign.web.domain.PortalUser;
import com.studydesign.web.service.PortalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/index")
public class PortalIndexController {

    @Autowired
    private PortalUserService portalUserService;

 @GetMapping("/findAll")
    public List<PortalUser> findAll(){
        return portalUserService.findAll();
    }

}
