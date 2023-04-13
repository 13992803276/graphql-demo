package com.example.graphqldemo.types;

import lombok.Data;

import java.util.List;


/**
 * @author lexu
 */
@Data
public class Class {
    private Integer id;

    private String name;

    private Integer ranking;

    private List<Student> students;
}
