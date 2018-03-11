package com.example.fbj.demo.Dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HelloDao {

    List getDataTest();
}
