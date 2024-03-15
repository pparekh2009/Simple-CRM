package com.priyansh.crm.controller;

import com.priyansh.crm.model.Contact;
import com.priyansh.crm.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ContactRestController {

    @Autowired
    private ContactService contactService;

    Logger logger = LoggerFactory.getLogger(ContactRestController.class);

    @PostMapping("/contacts/samples")
    public int addSampleContacts() {
        ArrayList<Contact> sampleContacts = new ArrayList<>();

        sampleContacts.add(new Contact("Maggie Gaudin", "mgaudin0@de.vu", "(264) 9918595", "51589 Westend Plaza", "Assistant Professor", "Skalith", "n/a"));
        sampleContacts.add(new Contact("Germaine Latchmore", 	"glatchmore1@unicef.org", "(320) 2946272", "565 Judy Lane", "Systems Administrator IV", "Oozz", "Oil & Gas Production"));
        sampleContacts.add(new Contact("Alysia Eakley", "aeakley2@noaa.gov", "(703) 2586016", "94 Independence Drive", "Research Assistant II", "Voolia", "Major Chemicals"));
        sampleContacts.add(new Contact("Anita Matusiak", "amatusiak3@mashable.com", "(929) 2568591", "123 Haas Drive", "Tax Accountant", "Trilia", "n/a"));
        sampleContacts.add(new Contact("Merrilee McNeil", "mmcneil4@stumbleupon.com", "(344) 6149448", "48 Sugar Crossing", "Assistant Professor", "Brainbox", "Home Furnishings"));
        sampleContacts.add(new Contact("Milka Sarjeant", "msarjeant5@bing.com", "(913) 4687948", "942 Westridge Circle", "Nurse Practicioner", "Brainlounge", "Electric Utilities: Central"));
        sampleContacts.add(new Contact("Maxim Ronchetti", "mronchetti6@woothemes.com", "(886) 1253131", "5 Westridge Parkway", "Web Designer III", "Talane", "Real Estate Investment Trusts"));
        sampleContacts.add(new Contact("Corty Gother", "cgother7@usnews.com", "(749) 1996919", "12738 Glacier Hill Alley", "Automation Specialist I", "Jabbersphere", "Biotechnology: Electromedical & Electrotherapeutic Apparatus"));
        sampleContacts.add(new Contact("Marve Rochell", "mrochell8@angelfire.com", "(688) 6506009", "385 Buhler Way", "Design Engineer", "JumpXS", "Recreational Products/Toys"));
        sampleContacts.add(new Contact("Drusy Briiginshaw", "dbriiginshaw9@nba.com", "(382) 8348483", "856 Debra Place", "Internal Auditor", "Rhyzio", "Major Banks"));

        int size = contactService.addSampleContacts(sampleContacts);
        logger.info("Items added: " + size);
        return size;
    }

    @DeleteMapping("/contacts/empty")
    public void deleteAll() {
        contactService.deleteAll();
    }
}
