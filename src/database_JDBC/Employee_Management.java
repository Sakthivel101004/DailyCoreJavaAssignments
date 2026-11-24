package database_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class Com_db{
	public Connection db() {
		Connection con=null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company_db", "root", "root");
		} catch (SQLException e) {
		System.out.println(e.getMessage());
		}
		return con;
	}
}

public class Employee_Management {
	Scanner scan=new Scanner(System.in);
  	Com_db db=new Com_db();
        Connection con=db.db();
        
        String create="create table employee"
        		+ " ("
        		+ "emp_id int primary key,"
        		+ "emp_name varchar(50),"
        		+ "salary double,"
        		+ "department varchar(50)"
        		+ ")";
        
        public void create() {
        	try {
				Statement st=con.createStatement();
				st.executeUpdate(create);
				System.out.println("Table created successfully ");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        	
        }
        
        String insert="insert into employee values(?,?,?,?)";
        
        public void insert() {
        	
        	System.out.println("insert details for the employee table");
        	System.out.println("enter the emp id :");
        	int id=scan.nextInt();
        	scan.nextLine();
        	System.out.println("enter the emp name :");
        	String name=scan.nextLine();
        	System.out.println("enter the emp salary :");
        	double sal=scan.nextDouble();
        	scan.nextLine();
        	System.out.println("enter the emp dept :");
        	String dept=scan.nextLine();
        	try {
				PreparedStatement ps=con.prepareStatement(insert);
				ps.setInt(1,id);
				ps.setString(2,name);
				ps.setDouble(3, sal);
				ps.setString(4,dept);
				ps.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        	
        }
        
        String select="select emp_id,emp_name from employee";
        
        public void select() {
        	try {
				Statement st=con.createStatement();
				ResultSet data=st.executeQuery(select);
				while(data.next()) {
					System.out.println("emp_id :"+" "+data.getInt("emp_id") +" emp_name :" +" "+data.getString("emp_name"));
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
        	}
        
        public static void main(String args[]) {
        	
        	Employee_Management emp=new Employee_Management();
        	emp.create();
           	emp.insert();
        	emp.select();
        }
}
