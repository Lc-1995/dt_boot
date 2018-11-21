package com.sakura.dt_boot.dao;


import com.sakura.dt_boot.pojo.sysMenu;

public interface sysMenuMapper {
    int deleteByPrimaryKey(Long menuId);

    int insert(sysMenu record);

    int insertSelective(sysMenu record);

    sysMenu selectByPrimaryKey(Long menuId);

    int updateByPrimaryKeySelective(sysMenu record);

    int updateByPrimaryKey(sysMenu record);
}