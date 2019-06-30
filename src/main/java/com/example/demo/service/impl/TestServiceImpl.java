/**
 * 
 */
package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestDao;
import com.example.demo.entity.Test;
import com.example.demo.service.TestService;

/**
 * @author arockia
 *
 */
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestDao testDao;
	
	@Override
	public Test add(Test test) {
		/**
		 * logics
		 */
		testDao.save(test);
		return test;
	}

	@Override
	public Test update(Test test) {
		/**
		 * logics
		 */
		testDao.save(test);
		return test;
	}

	@Override
	public Test findById(Integer testId) {
		Optional<Test> test = testDao.findById(testId);
		return test.get();
	}

	@Override
	public List<Test> findAll() {
		List<Test> testList = testDao.findAll();
		return testList;
	}

	@Override
	public void deleteById(Integer testId) {
		testDao.deleteById(testId);
	}

	
}
