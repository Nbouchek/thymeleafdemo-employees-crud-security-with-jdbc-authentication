package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
	// search by name
	public List<Employee> findByFirstNameContainsOrLastNameContainsOrEmailContainsAllIgnoreCase(String name, String lName, String em);


//	@Query("SELECT emp FROM Employee emp WHERE emp.firstName = ?1 OR emp.lastName = ?2 OR emp.email = ?3")
//	Employee findByFooInAndBar(String fisr, String last, String email);

}
