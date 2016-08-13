package com.djvantsuman.fishCompany.main;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.djvantsuman.fishCompany.entity.Customer;
import com.djvantsuman.fishCompany.service.CustomerService;

@Named
public class Application {
	
	@Inject
	CustomerService customerService;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
        Application application = (Application)context.getBean("application");
        
      // System.out.println(application.addCustomer().getFirstName());
      System.out.println(application.findById(2).getLastName() + " " + application.findById(2).getFirstName());
      // application.remove(1);
	}
	
	public Customer addCustomer(){
		Customer customer = new Customer();
		customer.setFirstName("Ivan");
		customer.setLastName("Tsuman");
		customer.setPussvord("11111");
		customerService.save(customer);
		return customer;
	}
	
	public Customer findById(int id){
		return customerService.findById(id);
	}
	
	public void remove(int id){
		customerService.remove(id);
	}

}
