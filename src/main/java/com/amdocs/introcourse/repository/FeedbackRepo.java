package com.amdocs.introcourse.repository;

import com.amdocs.introcourse.domain.entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, String> {
}
