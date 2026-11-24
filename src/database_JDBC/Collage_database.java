package database_JDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Collage_database {
	
	Scanner scan=new Scanner(System.in);
	String create="create table student("
			+ "id int primary key,"
			+ "name varchar(50),"
			+ "age int,"
			+ "course varchar(50)"
			+ ")";
	
	Database_connection data= new Database_connection();
	Connection  con=data.conn();
	
	
	public void create() {
		try {
			Statement st=con.createStatement();
			st.executeUpdate(create);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	String insert="insert into student values(?,?,?,?)";
	public void inset() {
		
		System.out.println("Enter the student id :");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the student name:");
		String name=scan.nextLine();
		System.out.println("Enter the student age :");
		int age=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the student courese name: ");
		String course=scan.nextLine();
		try {
			PreparedStatement ps=con.prepareStatement(insert);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4,course);
			
			int row=ps.executeUpdate();
			if(row ==1) {
				System.out.println("data inserted successfully");
			}
		
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	String select="select * from student";
	
	public void view() {
		Statement st;
		try {
			st = con.createStatement();
			ResultSet data=st.executeQuery(select);
			while(data.next()) {
				System.out.println(data.getInt("id")+data.getString("name")+data.getInt("age")+data.getString("course"));
			}
		}
			catch (SQLException e) {
		System.out.println(e.getMessage());
		}

		
	}
	
	public static void main(String args[]) {
		
		Collage_database cd=new Collage_database();
		cd.create();
		//cd.inset();
		
		cd.view();
	}
	

}
