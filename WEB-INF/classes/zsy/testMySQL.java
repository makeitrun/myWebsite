package zsy;
import java.sql.*;

public class testMySQL {
	
	public static void main(String args[])
	{
		String url="jdbc:mysql://localhost:3306/jtest?user=root";
		Connection conn=null;
		Statement statement=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			statement=conn.createStatement();
			rs=statement.executeQuery("select * from users;");
			while(rs.next())
			{
				System.out.println("=== "+rs.getInt(1)+"===="+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try{
				if(rs!=null)
				{
					rs.close();
				}
				if(statement!=null)
				{
					statement.close();
				}
				if(conn!=null)
				{
					conn.close();
				}				
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}			
		}
	}
	
}
