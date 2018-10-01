import java.sql.Connection;
import java.sql.DriverManager;

public class DB_CONNECTION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JDBC_DRIVER="com.mysql.jdbc.Driver";
		String DB_URL="jdbc:mysql://localhost/java_database";
		String DB_USER="root";
		String DB_Pass="";
		Connection conn=null;
		
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_Pass);
			System.out.print("Database connection is Successfull.....!");
			conn.close();
			
		}
		catch(Exception e) 
		{
			System.out.println("Error...Connection is faild:"+e);
		}


	}

}
