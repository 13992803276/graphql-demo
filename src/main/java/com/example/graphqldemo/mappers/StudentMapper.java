package com.example.graphqldemo.mappers;


import com.example.graphqldemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * @author lexu
 */
@Mapper
public interface StudentMapper {

    @Select("select * from t_student where id = #{id}")
    Student getById(Integer id);

}
