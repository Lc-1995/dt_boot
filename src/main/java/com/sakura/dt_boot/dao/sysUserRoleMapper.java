package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysUserRole;

public interface sysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sysUserRole record);

    int insertSelective(sysUserRole record);

    sysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysUserRole record);

    int updateByPrimaryKey(sysUserRole record);
}