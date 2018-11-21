package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysUser;

public interface sysUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(sysUser record);

    int insertSelective(sysUser record);

    sysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(sysUser record);

    int updateByPrimaryKey(sysUser record);
}