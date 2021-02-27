import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class RegisterDao {
		private String url = "jdbc:mysql://localhost:3306/customers"; 
	    private String username = "root"; //MySQL username
	    private String password = "root"; //MySQL password
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

		public String insert(Member member){
			Connection con = getConnection();
			String sql = "insert into customer values(?,?,?,?)";
			String result = "data entered sucessfully";
			try{
				PreparedStatement preparedStatement = con.prepareStatement(sql);
				preparedStatement.setString(1,member.getUname());
				preparedStatement.setString(2, member.getPassword());
				preparedStatement.setString(3,member.getEmail());
				preparedStatement.setString(4, member.getPhone());	
			}
			catch(SQLException e){
				e.printStackTrace();
				result = "Data not entered";
			}
			return result;
		}
}