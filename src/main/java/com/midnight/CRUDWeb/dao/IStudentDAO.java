package com.midnight.CRUDWeb.dao;

import java.util.List;

import com.midnight.CRUDWeb.entity.Student;
/**
 * Data Access Object Interface for hb_student_tracker table.
 * 
 * @Repository
 * 
 * @author ASHISH SINGH
 */
public interface IStudentDAO {

	/**
	 * This method returns a list of rows from hb_student_tracker table.
	 *
	 */
	 public List<Student> studentList();
}
