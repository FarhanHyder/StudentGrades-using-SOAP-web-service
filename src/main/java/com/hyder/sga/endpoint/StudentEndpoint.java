package com.hyder.sga.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hyder.sga.service.StudentService;
import com.hyder.students.GetCreateStudentRequest;
import com.hyder.students.GetCreateStudentResponse;
import com.hyder.students.GetStudentRequest;
import com.hyder.students.GetStudentResponse;

@Endpoint
public class StudentEndpoint {
	
	@Autowired
	private StudentService studentService;
	
	@PayloadRoot(namespace="http://hyder.com/students", localPart="GetStudentRequest")
	@ResponsePayload
	public GetStudentResponse processStudentRequest(@RequestPayload GetStudentRequest request) {

		GetStudentResponse response = new GetStudentResponse();
		response.setStudent(studentService.getStudentById(request.getId()));
		
		return response;
	}
	
	@PayloadRoot(namespace="http://hyder.com/students", localPart="GetCreateStudentRequest")
	@ResponsePayload
	public GetCreateStudentResponse processCreateStudentRequest(@RequestPayload GetCreateStudentRequest request) {

		GetCreateStudentResponse response = new GetCreateStudentResponse();
		
		response = studentService.createStudent(request);
		
		return response;
	}
}
