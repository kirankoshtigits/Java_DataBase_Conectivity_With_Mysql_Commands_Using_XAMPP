import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String JDBC_DRIVER="com.mysql.jdbc.Driver";
		String DB_URL="jdbc:mysql://localhost/java_database";
		String DB_USER="root";
		String DB_Pass="";
		Connection conn=null;
		Statement stm=null;
		ResultSet rs=null;
		
		String query="Select * from Student"; 
		
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_Pass);
			
			stm=conn.createStatement();
			
			rs=stm.executeQuery(query);
			while(rs.next())
			{
				System.out.println("ID:"+rs.getInt("ID"));
				System.out.println("Name:"+rs.getString("Name"));
				System.out.println("City:"+rs.getString("City"));
				System.out.println("Password:"+rs.getString("Password"));
				System.out.println("Date&Time:"+rs.getDate("CreateDon"));
			}
			System.out.println("\n\nData Is Display Successfull.......!");
	
			stm.close();
			conn.close();
		}
		catch(Exception e) 
		{
			System.out.println("Error...Connection is faild:"+e);
		}

	}

}
