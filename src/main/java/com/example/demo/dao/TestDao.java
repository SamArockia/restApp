/**
 * 
 */
package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Test;

/**
 * @author arockia
 *
 */
public interface TestDao extends JpaRepository<Test, Integer>{

}
