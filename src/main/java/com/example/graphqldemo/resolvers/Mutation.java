package com.example.graphqldemo.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphqldemo.entity.School;
import com.example.graphqldemo.mappers.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author lexu
 */
@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private SchoolMapper schoolMapper;

    public Long createSchool(String name, Integer ranking) {
        School school = School.builder().name(name).ranking(ranking).build();
        schoolMapper.insert(school);
        return school.getId();
    }
}