package com.djvantsuman.fishCompany.service;

import com.djvantsuman.fishCompany.entity.Customer;
import java.util.List;

public interface CustomerService {
	
	public void save(Customer customer);
	public Customer findById(int id);
	public void remove(int id);
        public List<Customer> findAll();

}
