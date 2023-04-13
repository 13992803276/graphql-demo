package com.example.graphqldemo.resolvers;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqldemo.entity.Class;
import com.example.graphqldemo.entity.School;
import com.example.graphqldemo.entity.Student;
import com.example.graphqldemo.mappers.ClassMapper;
import com.example.graphqldemo.mappers.SchoolMapper;
import com.example.graphqldemo.mappers.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author lexu
 */
@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private SchoolMapper schoolMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private ClassMapper classMapper;

    public School getSchool(Integer id) {
        return schoolMapper.getById(id);
    }

    public Student getStudent(Integer id) {
        return studentMapper.getById(id);
    }

    public Class getClass(Integer id) {
        return classMapper.getById(id);
    }
}
