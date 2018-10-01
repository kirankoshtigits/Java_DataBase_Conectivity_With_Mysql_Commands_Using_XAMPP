import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String JDBC_DRIVER="com.mysql.jdbc.Driver";
		String DB_URL="jdbc:mysql://localhost/java_database";
		String DB_USER="root";
		String DB_Pass="";
		Connection conn=null;
		Statement stm=null;
		
		String query="INSERT INTO student(Name,City,Password,"
				+ "CreateDon)VALUES('Kiran','Salgare',md5('12345'),"
				+ "NOW())";
		
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_Pass);
			
			stm=conn.createStatement();
			
			stm.execute(query);
			System.out.println("Data Is Submit Successfull.......!");
	
			stm.close();
			conn.close();
		}
		catch(Exception e) 
		{
			System.out.println("Error...Connection is faild:"+e);
		}

	}

}
