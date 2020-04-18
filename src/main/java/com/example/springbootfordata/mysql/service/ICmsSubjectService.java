package com.example.springbootfordata.mysql.service;

import com.example.springbootfordata.mysql.domain.CmsSubject;

import java.util.List;

/**
 * @author xu
 * @date 2019-7-6
 */
public interface ICmsSubjectService {
    /**
     * 获取全部专题
     */
    List<CmsSubject> getAllSubject();
}
