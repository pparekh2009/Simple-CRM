package com.priyansh.crm.controller;

import com.priyansh.crm.model.Contact;
import com.priyansh.crm.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contacts")
    public String getAllContacts(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "contact/all_contacts";
    }

    @GetMapping("contacts/{id}")
    public String getContact(@PathVariable int id, Model model) {
        model.addAttribute("contact", contactService.getContact(id));
        return "contact/view_contact";
    }


    @PostMapping("/contacts")
    public String addContact(Contact contact) {
        contactService.addContact(contact);
        return "contact/all_contacts";
    }
}