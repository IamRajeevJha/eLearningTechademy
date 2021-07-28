package com.example.demo.dao;

import java.sql.PreparedStatement;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
@Repository
public class UserDaoImpl implements UserDao {
	/**
	 * This function Add the user data in registration table 
	 * @param User user
	 * @return  true if data is added in registration table otherwise false
	 */
	@Override
	public boolean registerUser(User user) {
	
		try {
			DatabaseConfiguration dbConfig = new DatabaseConfiguration();
			PreparedStatement pstmt = dbConfig.getConnection().prepareStatement("insert into user(userid, uname, reg_date, email, password, address, phone, upload_photo) values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, user.getId());
			pstmt.setString(2, user.getName());
			java.sql.Date date = new java.sql.Date(user.getRegistrationDate().getTime());
			pstmt.setDate(3, date);
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getPassword());
			pstmt.setString(6,  user.getAddress());
			pstmt.setString(7, user.getPhone());
			pstmt.setBlob(8, user.getPicture());
			int count = pstmt.executeUpdate();
			System.out.println(count + " row inserted");
			dbConfig.getConnection().close();
			
		}
		catch( Exception e) {
			System.out.print("Exception in acceesing data:"+e);
			return false;
		}
		
		return true;
	}
	/**
	 * This function check if their is already a User with same Id or not.
	 * @param user
	 * @return true or false.
	 */
	public boolean validUserData(User user) {
		
		//Checking for unique userId in RegistrationTable 
		return true;
	}
	
}
