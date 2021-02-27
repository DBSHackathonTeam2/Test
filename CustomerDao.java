import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;
public class CustomerDao {
		private String url = "jdbc:mysql://localhost:3306/customer"; 
	    private String username = "root";
	    private String password = "root"; 
		public  Connection getConnection()
		{
			Connection con = null;
			try{
				 Class.forName("com.mysql.jdbc.Driver");  
				 con = DriverManager.getConnection(url, username, password); 
				 System.out.println("Printing connection object "+con);
			}
			catch(SQLException e){
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		     return con; 
		 }

		public String insert(Customer customer){
			Connection con = getConnection();
			String sql = "insert into customer values(?,?,?,?)";
			String result = "data entered sucessfully";
			try{
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1,customer.getName());
				preparedStatement.setString(2, customer.getPassword());
				preparedStatement.setString(3,customer.getEmail());
				preparedStatement.setString(4, customer.getPhone());	
			}
			catch(SQLException e){
				e.printStackTrace();
				result = "Data not entered";
			}
			return result;
		}
		public boolean getCustomer(String name,String pass){
			Connection con = getConnection();
			boolean status = false;
			try{  
				
				PreparedStatement ps=con.prepareStatement(  
				"select * from customer where name=? and pass=?");  
				ps.setString(1,name);  
				ps.setString(2,pass);  
				      
				ResultSet rs=ps.executeQuery();  
				status=rs.next();  
				          
				}
			catch(SQLException e){
				e.printStackTrace();
			}
			return status; 
		}  
}