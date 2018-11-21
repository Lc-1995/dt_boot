package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysConfig;

public interface sysConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sysConfig record);

    int insertSelective(sysConfig record);

    sysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysConfig record);

    int updateByPrimaryKey(sysConfig record);
}