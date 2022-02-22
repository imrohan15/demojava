package training.main.dayeleven.jbbcapp.ui;

import java.time.LocalDate;

import training.main.dayeleven.jbbcapp.data.Customer;
import training.main.dayeleven.jbbcapp.service.CustomerService;
import training.main.dayeleven.jbbcapp.service.CustomerServiceImpl;

public class CustomerUI {

			public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		/*ADD 1*/			//Customer customer = new Customer(10,"Skekhar Vermna",LocalDate.of(2000, 10, 15),8792456970L,"shekhar@gmail.com");
		/*Print 1*/			//System.out.println(customerService.addCustomer(customer));
		/*Display by id 2*/	Customer customer = customerService.getCustomerById(2);
		/*Print 2*/			System.out.println(customer);
			
		System.out.println("\nAll Customers : \n");
		System.out.println(customerService.getAllCustomers());	
		
		//Customer customerUp = new Customer(1,"Rakesh AA Verma",LocalDate.of(2000, 10, 15),9999999999L,"Rakesh@gmail.com");
		//System.out.println(customerService.updateCustomer(customerUp));
		
		//System.out.println(customerService.deleteCustomer(1));
		
		System.out.println(customerService.callProcedure(10));	
		//System.out.println(customerService.getAllCustomers());	
			
		}

}
