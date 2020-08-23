package com.midnight.CRUDWeb.dao;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.midnight.CRUDWeb.entity.Student;

/**
 * Data Access Object Implementation for hb_student_tracker table.
 *
 * @Repository
 * 
 * @author ASHISH SINGH
 */
@Repository
public class StudentDAO implements IStudentDAO {

	Logger logger = LogManager.getLogger(StudentDAO.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * This method returns a list of rows from hb_student_tracker table.
	 * 
	 */
	@Override
	public List<Student> studentList() {
		
		List<Student> studentList;
	try {	
		
		logger.debug("Initializing sessionFactory");
		//get session from session factory
		Session session = sessionFactory.getCurrentSession();
		
		logger.debug("Creating Query using hql");
		//create query hql
		Query<Student> query = session.createQuery("from Student", Student.class);
		
		logger.debug("Executing query...");
		//execute query
		studentList = query.getResultList(); 
	}catch(Exception e) {
		
		logger.error(e);
		studentList = null;
	};
		
	return studentList;
	}

}















