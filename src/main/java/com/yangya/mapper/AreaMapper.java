package com.yangya.mapper;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yangya.entity.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

	List<com.yangya.entity.Area> selectByPid(@Param("pid")Integer pid);
}