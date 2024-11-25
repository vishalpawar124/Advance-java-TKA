package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeDAO {
	
	// Method to create the 'employe' table
	public void CreateTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement s= c.createStatement();
		s.execute("Create table employe(id int primary key,name varchar(20),age int)");
		c.close();
		System.out.println("Table created sucessfully");
	}
	// Method to insert data into the 'employe' table
	public void InsertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		Statement s=c.createStatement();
		s.execute("INSERT INTO employe (id,name,age)VALUES (1,'vishal',23);");
		System.out.println("DATA HAS DISPLAY SUCCESSFULLY...");
	}
	 // Method to update data in the 'employe' table
    public void UpdateData() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
        Statement s = c.createStatement();
        s.execute("UPDATE employe SET name = 'Vikram', age = 25 WHERE id = 1");
        c.close();
        System.out.println("Data has been updated successfully...");
    }
 // Method to delete data from the 'employe' table
    public void DeleteData() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
        Statement s = c.createStatement();
        s.execute("DELETE FROM employe WHERE id = 1");
        c.close();
        System.out.println("Data has been deleted successfully...");
    }
    // Method to fetch and display data from the 'employe' table
    public void FetchData() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
        Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM employe");
        
        System.out.println("Fetching data...");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }
        c.close();
    }
}