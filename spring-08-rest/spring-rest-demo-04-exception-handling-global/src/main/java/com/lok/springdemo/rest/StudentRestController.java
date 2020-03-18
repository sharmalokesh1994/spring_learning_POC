package com.lok.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lok.springdemo.pojos.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	
	// @PostConstruct will be called only Once. Here we will write the lists
	List<Student> sList;
	@PostConstruct
	public void postConstruct() {
		sList = new ArrayList<>();
		
		sList.add( new Student("Joy","Sharma") );
		sList.add( new Student("Joy1","Sharma") );
		sList.add( new Student("Joy2","Sharma") );
	}
	
	
	@GetMapping("/list")
	public List<Student> getStudentList(){
		return sList;		
	}
	
	@GetMapping("/list/{studentId}")
	public Student getStudent( @PathVariable int studentId ){
		
		if( studentId>=sList.size() || studentId<0 ) {
			throw new StudentNotFoundException("Student Not Found");
		}

		return sList.get(studentId);
		
	}
	
	
}
