package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysRole;

public interface sysRoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(sysRole record);

    int insertSelective(sysRole record);

    sysRole selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(sysRole record);

    int updateByPrimaryKey(sysRole record);
}