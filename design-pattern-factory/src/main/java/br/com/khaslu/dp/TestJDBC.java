package br.com.khaslu.dp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBC {
	public static void main(final String[] args) throws SQLException, ClassNotFoundException {
		final Connection cn = JDBCFactory.getInstance();
		cn.prepareStatement("create table pessoa (nome varchar(255));").executeUpdate();
		cn.commit();
		final PreparedStatement ps = cn.prepareStatement("insert into pessoa values (?);");
		ps.setString(1, "Lucas Mota Vieira");
		ps.executeUpdate();
		ps.getConnection().commit();

		final ResultSet rs = cn.prepareStatement("select * from pessoa").executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		ps.close();
		cn.close();

	}
}
