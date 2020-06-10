

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseQuery {
	protected Connection con;
	private final String db = "jdbc:mysql://localhost:3306/classicmodels";

	public BaseQuery(String uname, String pwd){
		try {
		      //Class.forName("com.mysql.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver ());
			con = DriverManager.getConnection( db, uname, pwd);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	protected ResultSet useTable(String tableName) throws SQLException{
		String query = "select * from " + tableName; 
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery(query);
		return rs;
	}
	
	protected ResultSet requirementA() throws SQLException{
		String query = "SELECT * FROM productlines WHERE productLine LIKE \"%cars%\";";
		Statement q = con.createStatement();
		ResultSet Aans = q.executeQuery(query);
		return Aans;
	}
	
	protected ResultSet requirementB() throws SQLException{
		String query = " SELECT customers.contactFirstName,employees.firstName FROM customers Inner Join employees on customers.salesRepEmployeeNumber = employees.employeeNumber ORDER BY contactFirstName;";
		Statement e = con.createStatement();
		ResultSet bans = e.executeQuery(query);
		return bans;
	}
	
	protected ResultSet requirementC() throws SQLException{
		String query = " SELECT productName FROM products Inner Join orderdetails on products.productCode = orderdetails.productCode where products.buyPrice*2 <= orderdetails.priceEach group by products.productCode ORDER BY productName;";       
		Statement f = con.createStatement();
		ResultSet cans = f.executeQuery(query);
		return cans;
	}
	
	
	
	
	

}
