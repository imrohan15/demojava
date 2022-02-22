package training.main.dayeleven.jbbcapp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import training.main.dayeleven.jbbcapp.dao.CustomerDAOImpl;
import training.main.dayeleven.jbbcapp.data.Customer;

class TestCustmerByID {
	Customer customer = new Customer(4 , "Rahul Mishra" , null , 7897897897L , "rahul@gmail.com");
	CustomerDAOImpl cust = new CustomerDAOImpl();
	@Test
	void test() {
		Customer result = cust.getCustomerById(4);
		assertEquals(result, customer);
	}

}
