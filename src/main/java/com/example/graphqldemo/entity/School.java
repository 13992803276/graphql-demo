package com.example.graphqldemo.entity;

import lombok.Builder;
import lombok.Data;
/**
 * @author lexu
 */
@Data
@Builder
public class School {
    private Long id;

    private String name;

    private Integer ranking;
}
