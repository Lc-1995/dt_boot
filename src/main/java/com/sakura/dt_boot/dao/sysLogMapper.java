package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysLog;

public interface sysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sysLog record);

    int insertSelective(sysLog record);

    sysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysLog record);

    int updateByPrimaryKey(sysLog record);
}