package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.scheduleJobLog;

public interface scheduleJobLogMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(scheduleJobLog record);

    int insertSelective(scheduleJobLog record);

    scheduleJobLog selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(scheduleJobLog record);

    int updateByPrimaryKey(scheduleJobLog record);
}