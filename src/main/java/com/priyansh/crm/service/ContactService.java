package com.priyansh.crm.service;

import com.priyansh.crm.model.Contact;
import com.priyansh.crm.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return (List<Contact>) contactRepository.findAll();
    }

    public int addSampleContacts(List<Contact> sampleContacts) {
        List<Contact> contacts = (List<Contact>) contactRepository.saveAll(sampleContacts);
        return contacts.size();
    }

    public Contact getContact(int id) {
        return contactRepository.findById(id).orElse(null);
    }

    public void deleteAll() {
        contactRepository.deleteAll();
    }

    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

}
