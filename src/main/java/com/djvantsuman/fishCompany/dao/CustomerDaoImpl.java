package com.djvantsuman.fishCompany.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.djvantsuman.fishCompany.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
    private EntityManager em;

	public void save(Customer customer) {
		//em.persist(customer);
		if(customer.getId() == 0){
			em.persist(customer);
		} else {
			em.merge(customer);
		}
	}
	
	public Customer findById(int id){
		return em.find(Customer.class, id);
	}

	public void remove(int id) {
		Customer customer = em.find(Customer.class, id);
		
		if(customer != null){
			em.remove(customer);
		}
	}

}
