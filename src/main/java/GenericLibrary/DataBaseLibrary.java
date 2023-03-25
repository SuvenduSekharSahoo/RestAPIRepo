package GenericLibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseLibrary {

	 /*
	 * establish the connection with mysql DB
	 */
	
	Driver driverRef;
	Connection conn;
	public void connectToDB() throws SQLException
	{
		driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection(IConstants.dbURL, IConstants.dbUserName, IConstants.dbPassWord);
	}
	
	/**
	 *close db connection
	 * @throws SQLException 
	 * 
	 */
	public void closeDB() throws SQLException
	{
		conn.close();
	}
	
	public String readDataFromDBAndValidate(String query, int columnIndex, String expData) throws SQLException
	{
		boolean flag=false;
		ResultSet result = conn.createStatement().executeQuery(query);
		while(result.next())
		{
			if(result.getString(columnIndex).equalsIgnoreCase(expData))
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("data verified");
			return expData;
		}
		else
		{
			System.out.println("not verified");
			return "";
		}
		
	}
}
