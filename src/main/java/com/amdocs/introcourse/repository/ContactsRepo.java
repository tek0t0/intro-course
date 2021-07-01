package com.amdocs.introcourse.repository;

import com.amdocs.introcourse.domain.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepo extends JpaRepository<Contact, String> {
}
