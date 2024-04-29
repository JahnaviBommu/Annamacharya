import java.sql.*;
public class JDBCcreate
{
	public static void main(String args[])
	{
		//JDBC driver name and database URL
		String jdbcDriver="oracle.jdbc.driver.OracleDriver";
		String dbURL="jdbc:oracle:thin:@localhost:1521:XE";
		//Database credentials
		String user="system";
		String pass="jkc";
		Connection conn=null;
		Statement stmt=null;
		try
		{
			//step 2:Register JDBC driver
			Class.forName(jdbcDriver);
			//step 3:open a connection 
			System.out.println("connecting to database...");
			conn =DriverManager.getConnection(dbURL,user,pass);
			//step.4:Execute a query
			System.out.println("creating database...");
			stmt =conn.createStatement();
			if(stmt!=null)
			{
				System.out.println("connection established");
				String sqlq="create table aits13(rnum varchar(20),name varchar(20),branch varchar(20))";
				stmt.executeUpdate(sqlq);
				System.out.println("table created successfully");
			}
		}
		catch( ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
	}
}