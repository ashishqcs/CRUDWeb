package com.midnight.CRUDWeb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.midnight.CRUDWeb.entity.Student;


/**
 * Student Service providing interface.
 * 
 * @Service
 * @author ASHISH SINGH
 *
 */
public interface IStudentService {

	/**
	 * This method calls StudentDAO and fetches list of all Students.
	 * 
	 */
	public List<Student> getStudentList();
}
