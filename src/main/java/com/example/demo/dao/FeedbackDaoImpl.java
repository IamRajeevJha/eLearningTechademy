package com.example.demo.dao;

import java.sql.PreparedStatement;
import com.example.demo.model.Feedback;

public class FeedbackDaoImpl implements FeedbackDao {
	@Override
	public boolean addFeedback(Feedback feedback) {
		try {
			DatabaseConfiguration dbConfig = new DatabaseConfiguration();
			PreparedStatement pstmt = dbConfig.getConnection().prepareStatement(
					"insert into feedback(user_id, name, email, feedback)"
					+ " values(?,?,?,?)");
			pstmt.setInt(1, feedback.getUserId());
			pstmt.setString(2, feedback.getName());
			pstmt.setString(3, feedback.getEmail());
			pstmt.setString(4, feedback.getFeedback());
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
