package com.amdocs.introcourse.service.impl;

import com.amdocs.introcourse.domain.entities.Feedback;
import com.amdocs.introcourse.domain.model.FeedbackBindingModel;
import com.amdocs.introcourse.repository.FeedbackRepo;
import com.amdocs.introcourse.service.CourseService;
import com.amdocs.introcourse.service.EmployeeService;
import com.amdocs.introcourse.service.FeedbackService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepo feedbackRepo;
    private final EmployeeService employeeService;
    private final CourseService courseService;

    public FeedbackServiceImpl(FeedbackRepo feedbackRepo, EmployeeService employeeService, CourseService courseService) {
        this.feedbackRepo = feedbackRepo;
        this.employeeService = employeeService;
        this.courseService = courseService;
    }


    @Override
    public Feedback addFeedback(FeedbackBindingModel feedbackBindingModel) {
        Feedback feedback  = new Feedback();
        feedback
                .setText(feedbackBindingModel.getText())
                .setEmployee(this.employeeService.getEmployeeByName(feedbackBindingModel.getUsername()))
                .setCourse(this.courseService.getCourseByName(feedbackBindingModel.getCourseName()));



        return this.feedbackRepo.saveAndFlush(feedback);
    }

    @Override
    public List<FeedbackBindingModel> getAllFeedbacks() {
        List<FeedbackBindingModel> feedbacks = new ArrayList<>();
        List<Feedback> all = this.feedbackRepo.findAll();
        for (Feedback feedback : all) {
            FeedbackBindingModel fb = new FeedbackBindingModel();
            fb
                    .setText(feedback.getText())
                    .setCourseName(feedback.getCourse().getName())
                    .setUsername(feedback.getEmployee().getName());
            feedbacks.add(fb);
        }
        return feedbacks;
    }
}
