package uk.org.kelsohighschool.ps.program.tests;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import uk.org.kelsohighschool.ps.program.db.DatabaseConnector;

public class DatabaseConnectorTest {
	/**
	 * URL to connect to
	 */
	private String url = "jdbc:postgresql://localhost/outcometest";
	/**
	 * Username to login as
	 */
	private String username = "postgres";
	/**
	 * Password for login
	 */
	private String password = "postgres";

	/**
	 * tests the database connection
	 * @throws SQLException
	 */
	@Test
	public void testDatabaseConnector() throws SQLException {
		DatabaseConnector dc = new DatabaseConnector(url,username,password);
		dc.close();
	}
	
	/**
	 * gets the sql version then checks if it is 9.5.4
	 * @throws SQLException
	 */
	@Test
	public void testGetVer() throws SQLException {
		DatabaseConnector dc = new DatabaseConnector(url,username,password);
		assertEquals("9.5.6",dc.GetVer());
		dc.close();
	}
	
	/**
	 * tests the getco2 function
	 * @throws SQLException
	 */
	@Test
	public void testGetCo2() throws SQLException {
		DatabaseConnector dc = new DatabaseConnector(url,username,password);
		dc.getCo2();
		dc.close();
	}
	/**
	 * tests the getlocation function
	 * @throws SQLException
	 */
	@Test
	public void testGetLocation() throws SQLException {
		DatabaseConnector dc = new DatabaseConnector(url,username,password);
		dc.getLocation();
		dc.close();
	}
	/**
	 * tests the temp function
	 * @throws SQLException
	 */
	@Test
	public void testGetTemp() throws SQLException {
		DatabaseConnector dc = new DatabaseConnector(url,username,password);
		dc.getTemp();
		dc.close();
	}

}
