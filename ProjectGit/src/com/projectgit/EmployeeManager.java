package com.projectgit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
	public static List<Employee> populateEmployee(){
		List<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setEmployeeId(101);
		e1.setEmployeeName("Anurag");
		empList.add(e1);
		return empList;
	}
	
	public static void main(String[] args) {
		List<Employee> employees=populateEmployee();
		System.out.println(employees);
		
		
	}

}
