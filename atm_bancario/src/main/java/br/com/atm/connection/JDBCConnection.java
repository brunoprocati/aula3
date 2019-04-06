package br.com.atm.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/autom�ticocaixa?useTimezone=true&serverTimezone=UTC";
			String user ="root";
			String password ="";
			return DriverManager.getConnection(url, user,password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco.");
			e.printStackTrace();
		}
		return null;
	}

}