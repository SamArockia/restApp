/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Test;

/**
 * @author arockia
 *
 */
public interface TestService {

	/**
	 * 
	 * @param test
	 * @return
	 */
	public Test add(Test test);
	
	/**
	 * 
	 * @param test
	 * @return
	 */
	public Test update(Test test);
	
	/**
	 * 
	 * @param testId
	 * @return
	 */
	public Test findById(Integer testId);
	
	/**
	 * 
	 * @return
	 */
	public List<Test> findAll();
	
	/**
	 * 
	 * @param testId
	 */
	public void deleteById(Integer testId);
}
