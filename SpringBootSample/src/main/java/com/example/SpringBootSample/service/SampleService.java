package com.example.SpringBootSample.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.SpringBootSample.domain.Employee;

@Service
public class SampleService {

	@Cacheable("Employee")
	public Employee getStudentById(String id) {
				
		return new Employee(id,"venky");				
	}
}
