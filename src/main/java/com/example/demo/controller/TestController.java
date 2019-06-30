/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;

/**
 * @author arockia
 *
 */
@RestController
@RequestMapping("/api")
public class TestController {

	@Autowired
	private TestService testService;
	
	@PostMapping(value="/add")
	public Test add(@RequestBody Test test) {
		Test rTest = testService.add(test);
		return rTest;
	}
	
	@PostMapping(value="/update")
	public Test update(@RequestBody Test test) {
		Test rTest = testService.update(test);
		return rTest;
	}
	
	@GetMapping(value="/findById")
	public Test findById(@RequestBody @RequestParam("testId") Integer testId) {
		Test rTest = testService.findById(testId);
		return rTest;
	}
	
	@GetMapping(value="/findAll")
	public List<Test> findAll() {
		List<Test> testList = testService.findAll();
		return testList;
	}
	
	@GetMapping(value="/deleteById")
	public List<Test> deleteById(@RequestParam("testId") Integer testId) {
		testService.deleteById(testId);
		List<Test> testList = testService.findAll();
		return testList;
	}
}
