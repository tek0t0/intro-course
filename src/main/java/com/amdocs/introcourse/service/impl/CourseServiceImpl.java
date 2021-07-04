package com.amdocs.introcourse.service.impl;

import com.amdocs.introcourse.domain.entities.Course;
import com.amdocs.introcourse.domain.model.CourseBindingModel;
import com.amdocs.introcourse.repository.CourseRepo;
import com.amdocs.introcourse.service.CourseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
    private final ModelMapper modelMapper;

    public CourseServiceImpl(CourseRepo courseRepo, ModelMapper modelMapper) {
        this.courseRepo = courseRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public Course addCourse(CourseBindingModel courseBindingModel) {
        return this.courseRepo.saveAndFlush(modelMapper.map(courseBindingModel, Course.class));
    }
}
