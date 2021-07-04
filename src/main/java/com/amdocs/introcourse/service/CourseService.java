package com.amdocs.introcourse.service;

import com.amdocs.introcourse.domain.entities.Course;
import com.amdocs.introcourse.domain.model.CourseBindingModel;

public interface CourseService {
    public Course addCourse(CourseBindingModel courseBindingModel);

    public Course getCourseByName(String courseName);
}
