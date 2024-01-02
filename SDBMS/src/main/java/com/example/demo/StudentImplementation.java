package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImplementation {
	
	@Autowired
	StudentRepo repo;
	
	public Student addStu(Student s) {
		repo.save(s);
		return s;
	}
	
	public Integer deleteStu(Integer id) {
		Student s=repo.findById(id).orElse(null);
		if(s!=null) {
			repo.delete(s);
			return id;
		}
		else
			return null;
	}
	
	public Student getStu(Integer id) {
		Student s=repo.findById(id).orElse(null);
		if(s!=null) {
			return s;
		}
		else {
			return s;
		}
	}
	
	public Student updateStu(Student s1) {
		Student s2=repo.findById(s1.getId()).orElse(null);
		if(s2!=null) {
			s2.setId(s1.getId());
			s2.setName(s1.getName());
			s2.setAge(s1.getAge());
			s2.setEmail(s1.getEmail());
			
			repo.save(s2);
			return s2;
		}
		else
			return null;
	}

}
