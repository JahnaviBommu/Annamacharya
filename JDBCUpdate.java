//JDBCUPDATE.java
import java.sql.*;
public class JDBCUpdate
{
	public static void main(String args[])throws Exception
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
			Statement stmt=con.createStatement();
			String UQuery="update aits13 set branch='AIML'where rnum=1";
			int i=stmt.executeUpdate(UQuery);
			if(i>0)
			{
				System.out.println(i+"record updated");
			}
			else
			{
				System.out.println("no record updated,update operation unsucessful");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}