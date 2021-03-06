package com.yago.classschedule.controller;
import com.yago.classschedule.model.ClassSchedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.yago.classschedule.repository.ClassScheduleRepository;

@RestController
@RequestMapping("/api/v1/classschedule")
public class ClassScheduleController {
	
	@Autowired
	private ClassScheduleRepository classScheduleRepository;

	public ClassScheduleController(ClassScheduleRepository classScheduleRepository) {
		super();
		this.classScheduleRepository = classScheduleRepository;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping
	public List<ClassSchedule> getClassSchedule(){
		return classScheduleRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@CrossOrigin(origins = "http://localhost:4200")
	public ClassSchedule setClassSchedule(@RequestBody ClassSchedule classSchedule) {
		return classScheduleRepository.save(classSchedule);
	}

}
