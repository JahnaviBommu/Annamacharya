//JDBCDelete.java
import java.sql.*;
class JDBCDelete
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","jkc");
			Statement stmt=con.createStatement();
			String dquery="delete from aits13 where rnum=1";
			int i=stmt.executeUpdate(dquery);
			if(i>0)
			{
				System.out.println(i+"record deleted");
			}
			else
			{
				System.out.println("no record deleted,delete operation unsucessful");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}