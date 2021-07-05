package com.amdocs.introcourse.service.impl;

import com.amdocs.introcourse.domain.entities.Contact;
import com.amdocs.introcourse.domain.model.ContactBindingModel;
import com.amdocs.introcourse.repository.ContactsRepo;
import com.amdocs.introcourse.repository.EmployeeRepo;
import com.amdocs.introcourse.service.ContactService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactsRepo contactsRepo;
    private final EmployeeRepo employeeRepo;
    private final ModelMapper modelMapper;

    public ContactServiceImpl(ContactsRepo contactsRepo, EmployeeRepo employeeRepo, ModelMapper modelMapper) {
        this.contactsRepo = contactsRepo;
        this.employeeRepo = employeeRepo;
        this.modelMapper = modelMapper;
    }


    @Override
    public void addContact(ContactBindingModel contactBindingModel) {
        Contact contact = modelMapper.map(contactBindingModel, Contact.class);
        contact.setEmployee(employeeRepo.getByName(contactBindingModel.getName()));
        contactsRepo.saveAndFlush(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return this.contactsRepo.findAll();
    }
}
