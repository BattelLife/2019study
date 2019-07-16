package com.studydesign.web.service.impl;


import com.studydesign.web.dao.PortalUserMapper;
import com.studydesign.web.domain.PortalUser;
import com.studydesign.web.service.PortalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortalUserServiceImpl implements PortalUserService {


    @Autowired
    private PortalUserMapper portalUserMapper;

    @Override
    public List<PortalUser> findAll() {
        List<PortalUser> portalUserList = portalUserMapper.findAll();
        return portalUserList;
    }
}
