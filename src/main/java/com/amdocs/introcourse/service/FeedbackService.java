package com.amdocs.introcourse.service;

import com.amdocs.introcourse.domain.entities.Feedback;
import com.amdocs.introcourse.domain.model.FeedbackBindingModel;

public interface FeedbackService {
    public Feedback addFeedback(FeedbackBindingModel feedbackBindingModel);
}
