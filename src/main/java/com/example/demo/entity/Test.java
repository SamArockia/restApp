/**
 * 
 */
package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author arockia
 *
 */
@Entity
public class Test {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String strValue;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the strValue
	 */
	public String getStrValue() {
		return strValue;
	}

	/**
	 * @param strValue the strValue to set
	 */
	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}
	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param strValue
	 */
	public Test(Integer id, String strValue) {
		super();
		this.id = id;
		this.strValue = strValue;
	}
	
}
