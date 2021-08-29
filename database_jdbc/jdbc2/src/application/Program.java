package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM department");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs); //para evitar alguns try catches no programa principal rs.close();
			DB.closeStatement(st); // para evitar alguns try catches no programa principal st.close();
			DB.closeConnection();
		}
	}
}
