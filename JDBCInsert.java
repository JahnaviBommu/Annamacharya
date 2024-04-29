//JDBCinsert.java
import java.sql.*;
class JDBCInsert
{
	public static void main(String args[])
	{
		try
		{
			Class:forName("oracle.jdbc.driver.OracleDriver");
			Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","jkc");
			Statement stmt=con.createStatement();
			String iquery="insert into aits13(rnum,name,branch)values(1,'abc','CSE')";
			int i=stmt.executeUpdate(iquery);
			if(i>0)
			{
				System.out.println(i+"\t"+"record inserted");
			}
			else
			{
				System.out.println("no record inserted,Insert Operation Unsucessful");
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException ei)
		{
			ei.printStackTrace();
		}
	}
}

