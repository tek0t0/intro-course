package com.amdocs.introcourse.service;

import com.amdocs.introcourse.domain.entities.Feedback;
import com.amdocs.introcourse.domain.model.FeedbackBindingModel;

import java.util.List;

public interface FeedbackService {
    public Feedback addFeedback(FeedbackBindingModel feedbackBindingModel);

    List<FeedbackBindingModel> getAllFeedbacks();
}
