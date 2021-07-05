package com.amdocs.introcourse.service;

import com.amdocs.introcourse.domain.entities.Contact;
import com.amdocs.introcourse.domain.model.ContactBindingModel;

import java.util.List;

public interface ContactService {
    void addContact(ContactBindingModel contactBindingModel);

    List<Contact> getAllContacts();

}
