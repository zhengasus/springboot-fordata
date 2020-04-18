package com.example.springbootfordata.mysql.mapper;

import com.example.springbootfordata.mysql.domain.CmsSubject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ICmsSubjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsSubject record);

    int insertSelective(CmsSubject record);

    CmsSubject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsSubject record);

    int updateByPrimaryKeyWithBLOBs(CmsSubject record);

    int updateByPrimaryKey(CmsSubject record);
}