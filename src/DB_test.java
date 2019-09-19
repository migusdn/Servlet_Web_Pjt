import java.sql.*;
public class DB_test {

	
	public DB_test() {
		Connection conn = null;
		Statement state =null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "1111");
			conn.close();
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}
	
	
	
	
}
