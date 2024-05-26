package com.msb.easy_poi.controller;

import com.msb.easy_poi.entity.Course;
import com.msb.easy_poi.service.CourseService;
import org.apache.poi.ss.formula.functions.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Course> courses = courseService.findAll();
        System.out.println(courses);
        model.addAttribute("courses",courses);
        return "index";
    }

}
