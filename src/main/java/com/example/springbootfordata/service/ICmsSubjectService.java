package com.example.springbootfordata.service;

import com.example.springbootfordata.domain.CmsSubject;
import org.springframework.stereotype.Service;

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
