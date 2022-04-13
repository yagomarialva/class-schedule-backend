package com.yago.classschedule.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String student;
	private String teacher;
	private LocalDate doc;
	
	public ClassSchedule() {
		super();
	}
	
	
	public ClassSchedule(Long id, String student, String teacher, LocalDate doc) {
		super();
		this.id = id;
		this.student = student;
		this.teacher = teacher;
		this.doc = doc;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getStudent() {
		return student;
	}


	public void setStudent(String student) {
		this.student = student;
	}


	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public LocalDate getDoc() {
		return doc;
	}


	public void setDoc(LocalDate doc) {
		this.doc = doc;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassSchedule other = (ClassSchedule) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
}
