package training.main.dayeleven.jbbcapp.service;

import java.util.List;

import training.main.dayeleven.jbbcapp.dao.CustomerDAO;
import training.main.dayeleven.jbbcapp.dao.CustomerDAOImpl;
import training.main.dayeleven.jbbcapp.data.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDAO = new CustomerDAOImpl();
	@Override
	public Customer getCustomerById(Integer customerId) {
		
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getAllCustomers();
	}

	@Override
	public Integer addCustomer(Customer customer) {
		
		return customerDAO.addCustomer(customer);
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		return customerDAO.deleteCustomer(customerId);
	}

	@Override
	public String callProcedure(Integer custID) {
		return customerDAO.callProcedure(custID);
	}

}
