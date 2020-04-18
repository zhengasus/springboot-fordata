package com.example.springbootfordata.mysql.mapper;

import com.example.springbootfordata.mysql.domain.PmsProduct;
import com.example.springbootfordata.mysql.domain.PmsProductWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IPmsProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductWithBLOBs record);

    int insertSelective(PmsProductWithBLOBs record);

    int batchInsertSelective(List<PmsProduct> record);

    PmsProductWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PmsProductWithBLOBs record);

    int updateByPrimaryKey(PmsProduct record);
}