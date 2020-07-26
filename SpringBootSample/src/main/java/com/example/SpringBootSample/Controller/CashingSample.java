package com.example.SpringBootSample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootSample.domain.Employee;
import com.example.SpringBootSample.service.SampleService;

@RestController
public class CashingSample {
	
	@Autowired
	SampleService sampleService;

	@GetMapping("/cash/{id}")
	public Employee getCashing(@PathVariable String id) {
		
		System.out.println("This is sample spring appln "+id);		

		System.out.println("Workspace one "+id);

		System.out.println("This is sample spring appln new changes Two "+id);	
		

		System.out.println("This is sample spring appln new changes Third push....... "+id);	

		return sampleService.getStudentById(id);
		
	}
}
