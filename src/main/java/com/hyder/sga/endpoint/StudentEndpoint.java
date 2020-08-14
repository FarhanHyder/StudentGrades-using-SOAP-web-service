package com.hyder.sga.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hyder.sga.service.StudentService;
import com.hyder.students.CreateStudentRequest;
import com.hyder.students.CreateStudentResponse;
import com.hyder.students.DeleteStudentRequest;
import com.hyder.students.DeleteStudentResponse;
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
	
	@PayloadRoot(namespace="http://hyder.com/students", localPart="CreateStudentRequest")
	@ResponsePayload
	public CreateStudentResponse processCreateStudentRequest(@RequestPayload CreateStudentRequest request) {

		CreateStudentResponse response = new CreateStudentResponse();
		
		response = studentService.createStudent(request);
		
		return response;
	}
	
	@PayloadRoot(namespace="http://hyder.com/students", localPart="DeleteStudentRequest")
	@ResponsePayload
	public DeleteStudentResponse processDeleteStudentRequest(@RequestPayload DeleteStudentRequest request) {

		DeleteStudentResponse response = new DeleteStudentResponse();
		
		response.setStatus(studentService.deleteStudent(request.getId()));
		
		return response;
	}
}
