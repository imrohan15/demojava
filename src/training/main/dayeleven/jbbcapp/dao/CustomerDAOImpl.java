package training.main.dayeleven.jbbcapp.dao;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import training.main.dayeleven.jbbcapp.data.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public Customer getCustomerById(Integer customerId) {
		final String get_customer="select * from customer where customerId=?"; 
		Customer customer = new Customer();
		
		try {
			String url = "jdbc:mysql://localhost:3308/training";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(get_customer);
			preparedStatement.setInt(1, customerId);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()) {
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(2));
				//customer.setBirthDate(rs.getDate(3).toLocalDate());
				customer.setMobile(rs.getLong(4));
				customer.setEmail(rs.getString(5));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		String url = "jdbc:mysql://localhost:3308/training";
		String GET_ALL_CUST = "select * from customer";
		List<Customer> customerList = new ArrayList<Customer>();
		try {
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(GET_ALL_CUST);
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setCustomerName(rs.getString(2));
				//customer.setBirthDate(rs.getDate(3).toLocalDate());
				customer.setMobile(rs.getLong(4));
				customer.setEmail(rs.getString(5));
				
				customerList.add(customer);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerList;
	}

	@Override
	public Integer addCustomer(Customer customer) {
		String ADD_CUSTOMER ="INSERT INTO CUSTOMER VALUES(?,?,?,?,?)"; 
		int row = 0;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3308/training";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(ADD_CUSTOMER);
			preparedStatement.setInt(1, customer.getCustomerId());
			preparedStatement.setString(2, customer.getCustomerName());
			preparedStatement.setDate(3, null);
			preparedStatement.setLong(4, customer.getMobile());
			preparedStatement.setString(5,customer.getEmail());
			
			row = preparedStatement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return row;
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		final String update_customer="update customer set CustomerName=?,DOB=?,MobNo=?,Email=? where customerId=?"; 
		int row = 0;
		try {
			String url = "jdbc:mysql://localhost:3308/training";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(update_customer);
			
			preparedStatement.setString(1, customer.getCustomerName());
			preparedStatement.setDate(2, null);
			preparedStatement.setLong(3, customer.getMobile());
			preparedStatement.setString(4,customer.getEmail());
			preparedStatement.setInt(5, customer.getCustomerId());
			
			row = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return row;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {
		final String delete_customer="Delete from customer where customerId=?"; 
		int row = 0;
		try {
			String url = "jdbc:mysql://localhost:3308/training";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			PreparedStatement preparedStatement = conn.prepareStatement(delete_customer);
			preparedStatement.setInt(1, customerId);
			row = preparedStatement.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return row;
	}

	@Override
	public String callProcedure(Integer custID) {
		/*	//SQL STATEMENTS ----->
		 * 
		 * 	use training;

			DROP procedure IF EXISTS delete_data;
			
			DELIMITER $$
			USE training $$
			CREATE procedure delete_data(custId int)
			BEGIN
				DELETE FROM CUSTOMER WHERE customerId=custId;
			END$$
			DELIMITER ;
		 * 
		 * */
		String url = "jdbc:mysql://localhost:3308/training";
		try {
			Connection conn = DriverManager.getConnection(url, "root", "root");
			CallableStatement callableStatement = conn.prepareCall("{call delete_data(?)}");
			callableStatement.setInt(1, custID);	
			int n = callableStatement.executeUpdate();
			if(n != 0) {
				return "Customer Data Deleted Successfully";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "\nError In Deleting Custoemr Data, No Record Found";
	}

}
