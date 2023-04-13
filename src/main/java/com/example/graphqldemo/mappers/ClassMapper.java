
package com.example.graphqldemo.mappers;

import com.example.graphqldemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import com.example.graphqldemo.entity.Class;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lexu
 */
@Component
@Mapper
public class ClassMapper {
    public static final List<Student> STUDENTS = Arrays.asList(
            Student.builder()
                    .classId(1)
                    .name("张三")
                    .age(18)
                    .id(1)
                    .build()
            ,
            Student.builder()
                    .classId(1)
                    .name("李四")
                    .age(18)
                    .id(2)
                    .build()
            ,
            Student.builder()
                    .classId(2)
                    .name("王五")
                    .age(18)
                    .id(3)
                    .build()
    );

    public Class getById(Integer id) {
        return Class.builder()
                .id(1)
                .name("class-1")
                .ranking(1)
                .students(STUDENTS.stream().filter(student -> student.getClassId().equals(id)).collect(Collectors.toList()))
                .build();
    }
}
