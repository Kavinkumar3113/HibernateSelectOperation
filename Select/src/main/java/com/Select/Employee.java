package com.Select;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String dept;
	private String designation;
	private String dateofjoin;
	private double salary;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", designation=" + designation
				+ ", dateofjoin=" + dateofjoin + ", salary=" + salary + "]";
	}
	
}
	
