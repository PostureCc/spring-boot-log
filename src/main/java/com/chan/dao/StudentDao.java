package com.chan.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentDao {

    //    @Select("select * from student")
    List<Map<String, Object>> queryInfo();

    List<Map<String, Object>> search(Map<String, Object> params);

}
