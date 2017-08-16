package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.auribises.model.User;

// DAO | Data Access Object
public class JDBCHelper {

	Connection con;
	PreparedStatement pStmt;
	
	public JDBCHelper() {
		try {
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void openConnection(){
		try {
			
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/GW2017EEB";
			String user = "root";
			String pass = "";
			
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("--Connection Created--");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public int registerUser(User user){
		
		int i = 0;
		
		try {
			//3. Create SQL Statement
			String sql = "insert into USER values(null, ?, ?, ?)";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.getName());
			pStmt.setString(2, user.getEmail());
			pStmt.setString(3, user.getPassword());
			
			//4. Execute SQL Statement
			i = pStmt.executeUpdate();
			if(i>0){
				System.out.println(user.getName()+" Registered");
			}else{
				System.out.println(user.getName()+" not Registered");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return i;
	}
	
	
	public boolean loginUser(User user){
		boolean login = false;
		try{
			//3. Create SQL Statement
			String sql = "select * from USER where email = ? and password = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.getEmail());
			pStmt.setString(2, user.getPassword());
			
			ResultSet rs = pStmt.executeQuery();
			
			login = rs.next();
			
		}catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return login;
	}
	
	public void closeConnection(){
		try {
			pStmt.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
