package Sql;

import java.sql.*;
public class JDBCStatements {
	public static void main(String args[]){
	Connection con=null;
	Statement smt = null;
	PreparedStatement ps = null;
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dempdb?autoReconnect=true&useSSL=false&noAccessToProcedureBodies=true","nikhilghind","Nikhil@98");
		String sql = "CREATE TABLE Customer(customer_id INTEGER not NULL PRIMARY KEY,customer_name VARCHAR(255))";
		smt = con.createStatement();
		smt.execute(sql);
		sql = "CREATE TABLE Order_date(order_id INTEGER not NULL PRIMARY KEY,order_date VARCHAR(255) FORIEGN KEY REFERENCES Date(date_id),total_order INTEGER)";
		smt.execute(sql);
		sql = "INSERT INTO Customer(customer_id,customer_name) values(?,?)";
		ps = con.prepareStatement(sql);
		ps.setInt(1, 1);
		ps.setString(2, "nikhilghind");
		ps.executeUpdate();
		ps = con.prepareStatement("SELECT * FROM Customer");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " +rs.getString("customer_name"));
			System.out.println(rs.getString("customer_id") + " " +rs.getString("customer_name"));
		}
		CallableStatement stmt = con.prepareCall("call insertr(?,?)");
		stmt.setInt(1,3);
		stmt.setString(2,"mohit");
		stmt.execute();
	}
	catch(Exception e){ 
		System.out.println(e);
	}
	finally{
		try {
			con.close();
			smt.close();
			ps.close();
		}
		catch(Exception e) {
			System.out.println("Band nhi hua");
		}
	}
	}
	
}