package com.example.demo.dao;

import java.sql.PreparedStatement;

import com.example.demo.model.Contact;

public class ContactDaoImpl implements ContactDao {

	@Override
	public boolean addContact(Contact contact) {
		try {
			DatabaseConfiguration dbConfig = new DatabaseConfiguration();
			PreparedStatement pstmt = dbConfig.getConnection().prepareStatement(
					"insert into contact(user_id, name, email, phone_no, message)"
					+ " values(?,?,?,?,?)");
			pstmt.setInt(1, contact.getUserId());
			pstmt.setString(2, contact.getName());
			pstmt.setString(3, contact.getEmail());
			pstmt.setString(4, contact.getPhone());
			pstmt.setString(5, contact.getMessage().trim());
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

}
