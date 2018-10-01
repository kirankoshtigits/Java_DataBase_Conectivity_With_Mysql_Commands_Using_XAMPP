import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create_Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String JDBC_DRIVER="com.mysql.jdbc.Driver";
		String DB_URL="jdbc:mysql://localhost/java_database";
		String DB_USER="root";
		String DB_Pass="";
		Connection conn=null;
		Statement stm=null;
		
		DatabaseMetaData dmd=conn.getDataMeta();
		ResultSet rs=dmd.getTable(null,null,"Student");
		
		String query="CREATE TABLE Student("
				+ "ID INT NOT NULL AUTO_INCREMENT,"
				+ "Name VARCHAR(40) NOT NULL,"
				+ "City VARCHAR(40) NOT NULL,"
				+ "Password VARCHAR(40) NOT NULL,"
				+ "CreateDon DATE NOT NULL,"
				+ "PRIMARY KEY(ID))";
				
				
		
		try
		{
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,DB_USER,DB_Pass);
			
			stm=conn.createStatement();
			
			stm.execute(query);
			System.out.println("Table Is Create Successfull.......!");
	
			stm.close();
			conn.close();
		}
		catch(Exception e) 
		{
			System.out.println("Error...Connection is faild:"+e);
		}

	}
}
