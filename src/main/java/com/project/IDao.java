package com.project;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDao {
    public int dual();
}