package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysRoleMenu;

public interface sysRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sysRoleMenu record);

    int insertSelective(sysRoleMenu record);

    sysRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sysRoleMenu record);

    int updateByPrimaryKey(sysRoleMenu record);
}