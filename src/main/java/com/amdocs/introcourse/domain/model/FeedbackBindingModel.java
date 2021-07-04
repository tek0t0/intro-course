package com.amdocs.introcourse.domain.model;

public class FeedbackBindingModel {
    private String username;
    private String courseName;
    private String text;

    public String getUsername() {
        return username;
    }

    public FeedbackBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getCourseName() {
        return courseName;
    }

    public FeedbackBindingModel setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public String getText() {
        return text;
    }

    public FeedbackBindingModel setText(String text) {
        this.text = text;
        return this;
    }
}
