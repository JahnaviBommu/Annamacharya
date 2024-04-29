//JDBCSelect java
import java.sql.*;
class JDBCSelect
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","jkc");
			Statement stmt=con.createStatement();
			String squery="select* from aits12";
			ResultSet rs=stmt.executeQuery(squery);
			int i=1;
			while(rs.next())
			{
				System.out.println("Aits13:"+i);
				System.out.println("*******");
				System.out.println("rnum:"+rs.getString("rnum")+"\t");
				System.out.println("name:"+rs.getString("name")+"\t");
				System.out.println("branch:"+rs.getString("Branch")+"\n");
				i++;
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