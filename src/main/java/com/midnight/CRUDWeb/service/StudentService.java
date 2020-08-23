package com.midnight.CRUDWeb.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.midnight.CRUDWeb.dao.IStudentDAO;
import com.midnight.CRUDWeb.entity.Student;


/**
 * This is a Student Service class.
 * 
 * @Service
 * @author ASHISH SINGH
 */
@Service
public class StudentService implements IStudentService {

	Logger logger = LogManager.getLogger(StudentService.class);
	
	@Autowired
	private IStudentDAO student;
	
	
	/**
	 * This method calls StudentDAO and fetches list of all Students.
	 * 
	 */
	@Override
	@Transactional
	public List<Student> getStudentList() {
		
		logger.debug("Calling StudentDAO");
		return student.studentList();
	}

	
}
