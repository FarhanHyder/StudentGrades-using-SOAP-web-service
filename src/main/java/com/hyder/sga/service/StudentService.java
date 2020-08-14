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
	public void init() {
		
		Student mario = new Student();
		mario.setId(1);
		mario.setName("Mario");
		mario.setGpa(3.7);
		mario.setStanding("junior");
		
		Student puzo = new Student();
		mario.setId(2);
		mario.setName("Puzo");
		mario.setGpa(3.3);
		mario.setStanding("freshman");
		
		Student ryan = new Student();
		mario.setId(3);
		mario.setName("Ryan");
		mario.setGpa(3.1);
		mario.setStanding("sophomore");
		
		Student simon = new Student();
		mario.setId(4);
		mario.setName("Simon");
		mario.setGpa(3.9);
		mario.setStanding("senior");
		
		students.put(mario.getId(), mario);
		students.put(puzo.getId(), puzo);
		students.put(ryan.getId(), ryan);
		students.put(simon.getId(), simon);
		
	}

}
