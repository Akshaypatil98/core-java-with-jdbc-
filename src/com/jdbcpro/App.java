package com.jdbcpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import com.FoodOrder.Bean.Dish;
import com.FoodOrder.Util.FoodOrderImpl;


public class App {
	static final String DB_URL = "jdbc:mysql://localhost/foodOrder";
	static final String USER = "root";
	static final String PASS = "root";
	public static void main(String[] args) throws ClassNotFoundException {
		int j=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

			PreparedStatement stmt = conn.prepareStatement("insert into FoodDish values(?,?,?,?)");
			 FoodOrderImpl dm = new FoodOrderImpl();
			Set<Dish> stud = dm.populateData("Dish.txt");
			
			
			for (Dish s : stud) {
				System.out.println(s);
				stmt.setInt(1,s.getDishId());
				stmt.setString(2, s.getDishName());
				stmt.setInt(3, s.getCost());
				stmt.setDouble(4, s.getTimeToCook());
//				 j = 
						 stmt.execute();
			}
			
			//System.out.println(i + " records inserted");
			System.out.println(j + " records inserted");

			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
