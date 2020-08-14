package com.hyder.sga.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.hyder.students.GetCreateStudentRequest;
import com.hyder.students.GetCreateStudentResponse;
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
	
	public GetCreateStudentResponse createStudent(GetCreateStudentRequest student) {
		GetCreateStudentResponse response = new GetCreateStudentResponse();
		
		// NOTE: a shorter way to do the following is to just use the var "student"
			// however, doing this way just to have a better readability of the code
		Student newStudent = new Student();
		newStudent.setId(student.getId());
		newStudent.setName(student.getName());
		newStudent.setGpa(student.getGpa());
		newStudent.setStanding(student.getStanding());
		
		students.put(newStudent.getId(), newStudent);
		
		// NOTE: surely, the following can be updated when connecting to the db
		response.setStatus("success");
		response.setId(newStudent.getId());
		return response;
	}

}
