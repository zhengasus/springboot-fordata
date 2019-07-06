package com.example.springbootfordata.service.impl;

import com.example.springbootfordata.domain.CmsSubject;
import com.example.springbootfordata.mapper.ICmsSubjectMapper;
import com.example.springbootfordata.service.ICmsSubjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xu
 * @date 2019-7-6
 */
@Service
public class CmsSubjectServiceImpl implements ICmsSubjectService {
    @Resource
    ICmsSubjectMapper cmsSubjectMapper;

    @Override
    public List<CmsSubject> getAllSubject() {
        CmsSubject cmsSubject = cmsSubjectMapper.selectByPrimaryKey((long) 1);
        System.out.println(cmsSubject.toString());
        return null;
    }
}
