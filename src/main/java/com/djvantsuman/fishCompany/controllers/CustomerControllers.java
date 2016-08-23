/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.djvantsuman.fishCompany.controllers;

import com.djvantsuman.fishCompany.entity.Customer;
import com.djvantsuman.fishCompany.service.CustomerService;
import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Ivan
 */
//@Controller
@Controller
@RequestMapping("/customer/")
public class CustomerControllers {

    private CustomerService customerService;

    private String firstName_attribute = "firstName";
    private String lastName_attribute = "lastName";

    @Inject
    public CustomerControllers(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "registration.html", method = RequestMethod.GET)
    public String registration(Model model) {
        //    model.addAttribute("customer", new Customer());
        return "registration";
    }

    @RequestMapping(value = "registration.html", method = RequestMethod.POST)
    public String registrationSuccess(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String password, Model model) {

        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setPussvord(password);
        customerService.save(customer);

        model.addAttribute(firstName_attribute, firstName);
        model.addAttribute(lastName_attribute, lastName);
        return "indexSuccess";
    }

    @RequestMapping(value = "enter.html", method = RequestMethod.GET)
    public String enter(Model model) {
        return "enter";
    }

    @RequestMapping(value = "enter.html", method = RequestMethod.POST)
    public String enterSuccess(@RequestParam String firstName, @RequestParam String password, Model model) {
        List<Customer> listC = customerService.findAll();
        for (Customer customer : listC) {
            if (customer.getFirstName().equals(firstName) & customer.getPussvord().equals(password)) {
                model.addAttribute(firstName_attribute, firstName);
                model.addAttribute(lastName_attribute, customer.getLastName());
                return "indexSuccess";
            }
        }
        return "index";
    }
}
