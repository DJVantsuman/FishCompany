package com.djvantsuman.fishCompany.service;

import com.djvantsuman.fishCompany.entity.Customer;

public interface CustomerService {
	
	public void save(Customer customer);
	public Customer findById(int id);
	public void remove(int id);

}
