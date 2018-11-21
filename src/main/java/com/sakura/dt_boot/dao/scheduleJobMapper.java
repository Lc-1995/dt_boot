package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.scheduleJob;

public interface scheduleJobMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(scheduleJob record);

    int insertSelective(scheduleJob record);

    scheduleJob selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(scheduleJob record);

    int updateByPrimaryKey(scheduleJob record);
}