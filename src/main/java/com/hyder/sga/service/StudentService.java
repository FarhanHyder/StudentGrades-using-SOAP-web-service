package com.hyder.sga.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.hyder.students.Student;

@Service
public class StudentService {
	
	private static final Map<Integer, Student> students = new HashMap<>();
	
	@PostConstruct
	public void initialize() {
		
		Student mario = new Student();
		mario.setId(1);
		mario.setName("Mario");
		mario.setGpa(3.7);
		mario.setStanding("junior");
		
		Student puzo = new Student();
		puzo.setId(2);
		puzo.setName("Puzo");
		puzo.setGpa(3.3);
		puzo.setStanding("freshman");
		
		Student ryan = new Student();
		ryan.setId(3);
		ryan.setName("Ryan");
		ryan.setGpa(3.1);
		ryan.setStanding("sophomore");
		
		Student simon = new Student();
		simon.setId(4);
		simon.setName("Simon");
		simon.setGpa(3.9);
		simon.setStanding("senior");
		
		students.put(mario.getId(), mario);
		students.put(puzo.getId(), puzo);
		students.put(ryan.getId(), ryan);
		students.put(simon.getId(), simon);
	}
	
	public Student getStudentById(int id) {		
		return students.get(id);
	}

}
