import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/test_db";
		String userID = "javaDB";
		String userPass = "";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(jdbcUrl, userID, userPass);
			System.out.println("connection success");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
