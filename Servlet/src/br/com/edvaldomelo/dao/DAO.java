package br.com.edvaldomelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public Connection getConnection() {
		Connection connection = null;
		String user = "postgres";
		String password = "teco01";
		String databaseName = "bdedvaldomelo";
 
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + databaseName,
					 user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}