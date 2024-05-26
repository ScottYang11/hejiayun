package com.msb.easy_poi.service.impl;

import com.msb.easy_poi.dao.CourseMapper;
import com.msb.easy_poi.entity.Course;
import com.msb.easy_poi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }
}
