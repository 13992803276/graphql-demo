package com.example.graphqldemo.mappers;

import com.example.graphqldemo.entity.School;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;



/**
 * @author lexu
 */
@Mapper
public interface SchoolMapper {

    @Select("select * from t_school where id= #{id}")
    School getById(Integer id);

    @Insert("insert into t_school (name, ranking) values (#{name}, #{ranking})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(School school);
}
