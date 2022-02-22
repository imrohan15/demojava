package training.main.dayeleven.jbbcapp.service;

import java.util.List;

import training.main.dayeleven.jbbcapp.data.Customer;

public interface CustomerService {
	//CRUD operations 
		//Retrieve 
		public Customer getCustomerById(Integer customerId);
		public List<Customer> getAllCustomers();
		//Create 
		public Integer addCustomer(Customer customer);
		//Update
		public Integer updateCustomer(Customer customer);
		//Delete
		public Integer deleteCustomer(Integer customerId);
		
		public String callProcedure(Integer custID);
}