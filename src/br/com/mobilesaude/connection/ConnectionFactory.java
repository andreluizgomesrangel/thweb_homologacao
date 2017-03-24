package br.com.mobilesaude.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
	     try {
	         return DriverManager.getConnection(
	        		 "jdbc:mysql://dbhomologacao.mobilesaude.com.br/thweb_homologacao", "andre", "VuydF7b00@uwGj8T");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
	 }
	
}
