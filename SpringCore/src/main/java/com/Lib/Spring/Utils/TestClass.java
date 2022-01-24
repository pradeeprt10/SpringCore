package com.Lib.Spring.Utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Lib.SpringCore.StudentDetails;

public class TestClass {

	public static void main(String[] args) {
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("EmployeeConfig.xml");
		EmployeeDetails employee1 = (EmployeeDetails) cont.getBean("emp1");
		System.out.println(employee1);
		
	}
}
