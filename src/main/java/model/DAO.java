package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone= UTC";
	private String user = "root";
	private String password = "senhamysqlServer";

	private Connection conectar() {
		Connection con = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);

			return con;
		} catch (Exception e) {
			System.out.print(e);
			return null;
		}
	}

	public void testeConexao() {
		try {
			Connection con = conectar();
			System.out.print(con);
			con.close();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
