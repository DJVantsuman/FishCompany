package com.djvantsuman.fishCompany.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import com.djvantsuman.fishCompany.dao.CustomerDao;
import com.djvantsuman.fishCompany.entity.Customer;
import java.util.List;

@Named
public class CustomerServiceImpl implements CustomerService {

    @Inject
    private CustomerDao customerDao;

    @Transactional
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    public Customer findById(int id) {
        return customerDao.findById(id);
    }

    @Transactional
    public void remove(int id) {
        customerDao.remove(id);
    }

    public List<Customer> findAll() {
        return customerDao.findAll();
    }

}
