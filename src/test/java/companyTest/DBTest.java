/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companyTest;

import com.djvantsuman.fishCompany.entity.Customer;
import com.djvantsuman.fishCompany.service.CustomerService;
import com.djvantsuman.fishCompany.service.CustomerServiceImpl;
import java.util.List;
import javax.inject.Inject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ivan
 */
public class DBTest {
    
    
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    
    public DBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void saveCustomer(){
        Customer customer = new Customer();
        customer.setFirstName("firstName");
        customer.setLastName("lastName");
        customer.setPussvord("password");
        customerService.save(customer);
    }
    
    @Test
    public void getAllCustomers(){
        List<Customer> list = customerService.findAll();
        for(Customer c:list){
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getPussvord());
        }
    }
}
