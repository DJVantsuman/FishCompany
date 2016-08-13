package com.djvantsuman.fishCompany.dao;

import com.djvantsuman.fishCompany.entity.Customer;
import java.util.List;

public interface CustomerDao {
	
	public void save(Customer customer);
	public Customer findById(int id);
	public void remove(int id);
        public List<Customer> findAll();


}
