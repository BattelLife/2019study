package com.studydesign.web.dao;


import com.studydesign.web.domain.PortalUser;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface PortalUserMapper {
    List<PortalUser> findAll();
}
