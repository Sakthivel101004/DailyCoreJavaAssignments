package database_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



class dbcon{
	 public Connection db() {
		 Connection con=null;
		 try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping_db", "root", "root");
			
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		 return con;
	 }
}

public class Shopping_db {
	Scanner scan=new Scanner(System.in);
	dbcon co=new dbcon();
	Connection con=co.db();
	String create="create table product ("
			+ "product_id int primary key,"
			+ "product_name varchar(50),"
			+ "price double,"
			+ "qty int "
			+ ")";
	
	public void create() {
	        try {
				Statement st=con.createStatement();
				int data=st.executeUpdate(create);
				
				if(data==1) {
					System.out.println("Table created successfully............");
				}
		
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
			}
	        
	}
	
	String insert="insert into product values(?,?,?,?)";
	public void insert() {
		System.out.println("Enter the product details one by one ");
		System.out.println("Enter the product id :");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the product name :");
		String name=scan.nextLine();
		System.out.println("Enter the product price :");
		Double price=scan.nextDouble();
		System.out.println("Enter the product  quantity:");
		int qty=scan.nextInt();
		try {
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1,id);
			ps.setString(2,name);
			ps.setDouble(3, price);
			ps.setInt(4, qty);
			int row=ps.executeUpdate();
			if(row==1) {
				System.out.println("product add successfully !!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	String select="select * from product";
	public void select() {
		try {
			Statement st=con.createStatement();
			ResultSet data=st.executeQuery(select);
			while(data.next()) {
				System.out.println(data.getInt("product_id")+" "+data.getString("product_name")+" "+data.getDouble("price")+" "+data.getInt("qty"));
			}
		} catch (SQLException e) {
			
		}
		
	}

	public static void main(String[] args) {
		Shopping_db show=new Shopping_db();
		show .create();
		show.insert();
		show.select();
	}

}
