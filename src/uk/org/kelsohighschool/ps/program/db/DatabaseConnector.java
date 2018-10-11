package uk.org.kelsohighschool.ps.program.db;

import java.sql.*;
import java.util.ArrayList; 

public class DatabaseConnector {
	private Connection conn;
	private Statement statement;
	private ResultSet resultSet;
	
	
	/*private static boolean testingMode = false;
		
	public static void enableTesting() {
		testingMode = true;
	}

	*/
	/**
	 * For connecting to the database
	 * @param url URL to connect to
	 * @param username Username to use
	 * @param password Password to use
	 * @throws SQLException
	 */
	public DatabaseConnector(String url,String username,String password) throws SQLException {
		conn = DriverManager.getConnection(url,username,password);
	}
	
	/**
	 * @return Version of psql currently running
	 * @throws SQLException
	 */
	public String GetVer() throws SQLException {
		statement = conn.createStatement();
		resultSet = statement.executeQuery("show server_version");
		String rtn = "";
		if (resultSet.next()) {
			rtn = resultSet.getString(1);
		}
		return rtn;
	}
	/**
	 * gets and returns a full arraylist with all the values in the co2 table
	 * @return full arraylist with all the values in the co2 table
	 * @throws SQLException
	 */
	public ArrayList<Co2> getCo2() throws SQLException { 
		statement = conn.createStatement();
		resultSet = statement.executeQuery("select * from co2");
		ArrayList<Co2> rtnVal = new ArrayList<Co2>();
		while (resultSet.next()) {
			Co2 co2= new Co2(resultSet.getInt(1),resultSet.getInt(4),resultSet.getFloat(2),resultSet.getInt(3));
			rtnVal.add(co2);
			//System.out.print(co2);
		} 
		return rtnVal;
	}

	/**
	 * gets and returns a full arraylist with all the values in the location table
	 * @return full arraylist with all the values in the location table
	 * @throws SQLException
	 */
	public ArrayList<Location> getLocation() throws SQLException { 
		statement = conn.createStatement();
		resultSet = statement.executeQuery("select * from location");
		ArrayList<Location> rtnVal = new ArrayList<Location>();
		while (resultSet.next()) {
			Location location= new Location(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3));
			rtnVal.add(location);
			System.out.print(location);
		} 
		return rtnVal;
	}
	
	/**
	 * gets and returns a full arraylist with all the values in the temp table
	 * @return full arraylist with all the values in the temp table
	 * @throws SQLException
	 */
	public ArrayList<Temp> getTemp() throws SQLException { 
		statement = conn.createStatement();
		resultSet = statement.executeQuery("select * from temp");
		ArrayList<Temp> rtnVal = new ArrayList<Temp>();
		while (resultSet.next()) {
			Temp temp= new Temp(resultSet.getInt(1),resultSet.getTimestamp(2),resultSet.getFloat(3),resultSet.getInt(4));
			rtnVal.add(temp);
			System.out.print(temp);
		} 
		return rtnVal;
	}

	/**
	 * Closes the database connection
	 */
	public void close() {
		// TODO Auto-generated method stub
		try {
			if (resultSet != null) {
				resultSet.close();
				}
			if (statement != null) {
				statement.close();
				}
			if (conn != null) {
				conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
		}
	}
}
