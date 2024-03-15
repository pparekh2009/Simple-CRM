package com.priyansh.crm.repository;

import com.priyansh.crm.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
}