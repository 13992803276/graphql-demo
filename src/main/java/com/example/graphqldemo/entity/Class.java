package com.example.graphqldemo.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author lexu
 */
@Data
@Builder
public class Class {
    private Integer id;

    private String name;

    private Integer ranking;

    private List<Student> students;
}
