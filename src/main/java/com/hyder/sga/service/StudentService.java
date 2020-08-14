package com.hyder.sga.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.hyder.students.CreateStudentRequest;
import com.hyder.students.CreateStudentResponse;
import com.hyder.students.Student;
import com.hyder.students.UpdateStudentRequest;
import com.hyder.students.UpdateStudentResponse;

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
	
	public CreateStudentResponse createStudent(CreateStudentRequest student) {
		CreateStudentResponse response = new CreateStudentResponse();
		
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
	
	// this is a different approach than the create method
	public String deleteStudent(int id) {
		students.remove(id);
		
		return "success";
	}
	
	public UpdateStudentResponse updateStudent(UpdateStudentRequest request) {
		UpdateStudentResponse response = new UpdateStudentResponse();
		
		students.replace(request.getId(),
				new Student(request.getId(), 
						this.getStudentById(request.getId()).getName(), 
						request.getGpa(), 
						request.getStanding()));
		
		response.setStatus("success");
		response.setStudent(this.getStudentById(request.getId()));
		
		return response;
	}

}
