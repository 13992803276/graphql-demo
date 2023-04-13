package com.example.graphqldemo.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author lexu
 */
@Data
@Builder
public class Student {

    private Integer id;

    private String name;

    private Integer age;

    private Integer classId;
}
