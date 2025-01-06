package com.xworkz.grocery.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.grocery.dto.GroceryDto;
import com.xworkz.grocery.util.GroceryUtil;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GroceryRepositoryImplementation implements GroceryRepository {

	@Override
	public boolean save(GroceryDto dto) {

		try {
			Connection connection = DriverManager.getConnection(GroceryUtil.JDBCURL, GroceryUtil.USERNAME,
					GroceryUtil.PASSWORD);

			String saveQuery = "insert into grocery_details(grocery_name,category,quantity,price) values(?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(saveQuery);

			statement.setString(1, dto.getGrocery_name());
			statement.setString(2, dto.getCategory());
			statement.setInt(3, dto.getQuantity());
			statement.setInt(4, dto.getPrice());

			if (!statement.execute()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

	@Override
	public List<GroceryDto> read() {

		List<GroceryDto> list = new ArrayList<GroceryDto>();

		try {

			Connection connection = DriverManager.getConnection(GroceryUtil.JDBCURL, GroceryUtil.USERNAME,
					GroceryUtil.PASSWORD);

			String readQuery = "select * from grocery_details";

			Statement statement = connection.createStatement();

			ResultSet resultset = statement.executeQuery(readQuery);

			while (resultset.next()) {

				GroceryDto dto = new GroceryDto();
				dto.setId(resultset.getInt(1));
				dto.setGrocery_name(resultset.getString(2));
				dto.setCategory(resultset.getString(3));
				dto.setQuantity(resultset.getInt(4));
				dto.setPrice(resultset.getInt(5));

				list.add(dto);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return list;
	}

	@Override
	public String deleteById(int id) {

		try {
			Connection connection = DriverManager.getConnection(GroceryUtil.JDBCURL, GroceryUtil.USERNAME,
					GroceryUtil.PASSWORD);

			String deleteQuery = "delete from grocery_details where id = ?";

			PreparedStatement statement = connection.prepareStatement(deleteQuery);

			statement.setInt(1, id);

			int rowsDeleted = statement.executeUpdate();

			return rowsDeleted + " rows deleted";

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return "not deleted";
	}

	@Override
	public GroceryDto searchById(int id) {

		try {

			Connection connection = DriverManager.getConnection(GroceryUtil.JDBCURL, GroceryUtil.USERNAME,
					GroceryUtil.PASSWORD);

			String searchQuery = "select * from grocery_details where id = ? ";

			PreparedStatement statement = connection.prepareStatement(searchQuery);

			statement.setInt(1, id);

			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {

				GroceryDto dto = new GroceryDto();
				dto.setId(resultSet.getInt(1));
				dto.setGrocery_name(resultSet.getString(2));
				dto.setCategory(resultSet.getString(3));
				dto.setQuantity(resultSet.getInt(4));
				dto.setPrice(resultSet.getInt(5));

				return dto;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return new GroceryDto();
	}

	@Override
	public String updateById(int id, GroceryDto dto) {
		
		try {
		Connection connection =	DriverManager.getConnection(GroceryUtil.JDBCURL, GroceryUtil.USERNAME, GroceryUtil.PASSWORD);
		
		String updateQuery = "update grocery_details set grocery_name = ?,category = ?,quantity = ?,price=?  where id=? ";
		
		PreparedStatement statement = connection.prepareStatement(updateQuery);
		
		statement.setString(1, dto.getGrocery_name());
		statement.setString(2, dto.getCategory() );
		statement.setInt(3, dto.getQuantity() );
		statement.setInt(4, dto.getPrice());
		
		statement.setInt(5, id);

		int updatedRows = statement.executeUpdate();
		
		return updatedRows+"rows updated sucessfully";
		
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return "not updated";
	}

}
