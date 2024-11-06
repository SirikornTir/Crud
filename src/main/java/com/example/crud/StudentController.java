package com.example.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	private StudentRepository StudentRepository ;
	
	@GetMapping
	public List<Student> getAllUsers(){
		return StudentRepository.findAll();
	}
	
	@PostMapping("/add")
	public Student createUser(@RequestBody Student students) {
		return StudentRepository.save(students);
	}
	
}
