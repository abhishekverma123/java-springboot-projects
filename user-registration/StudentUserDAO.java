package com.example.Website.repository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.example.Website.domain.StudentUser;
import java.util.List;
@Repository
@Scope("singleton")
public class StudentUserDAO implements DAO<StudentUser> {
	
	private List<StudentUser> studentUserList = new ArrayList<StudentUser>();
	
	@Override
	public Optional<StudentUser> get(Integer id) {
		if(!studentUserList.isEmpty()) {
			return Optional.of(studentUserList.get(id));
		}
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(StudentUser student) {
		// TODO Auto-generated method stub
		int userId = studentUserList.size();
		student.setId(userId);
		studentUserList.add(student);
		System.out.println("Student saved id "+userId);
		return userId;
	}
     
}
