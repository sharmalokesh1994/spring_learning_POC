package com.lok.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lok.springdemo.pojos.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	
	@GetMapping("/list")
	public List<Student> getStudentList(){
		
		List<Student> sList = new ArrayList<>();
		
		sList.add( new Student("Joy","Sharma") );
		sList.add( new Student("Joy1","Sharma") );
		sList.add( new Student("Joy2","Sharma") );
		
		return sList;
		
	}
	
}
