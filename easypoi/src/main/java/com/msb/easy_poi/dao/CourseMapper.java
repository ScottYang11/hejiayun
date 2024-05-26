package com.msb.easy_poi.dao;

import com.msb.easy_poi.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {
    //查询所有课程
    List<Course> findAll();

}
