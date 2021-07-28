package com.example.demo.dao;

import java.sql.PreparedStatement;
import com.example.demo.model.Course;

public class CourseDaoImpl implements CourseDao {
	@Override
	public boolean addCourse(Course course) {
		try {
			DatabaseConfiguration dbConfig = new DatabaseConfiguration();
			PreparedStatement pstmt = dbConfig.getConnection().prepareStatement(
					"insert into course(course_id, c_name, c_fees, c_resource, c_desp)"
					+ " values(?,?,?,?,?)");
			pstmt.setInt(1, course.getId());
			pstmt.setString(2, course.getName());
			pstmt.setString(3, course.getFee());
			pstmt.setString(4, course.getResources());
			pstmt.setString(5, course.getDesc().trim());
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
