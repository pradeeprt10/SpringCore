package com.Lib.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext cont = new ClassPathXmlApplicationContext("SpringCoreConfig.xml");
		StudentDetails stud1 = (StudentDetails) cont.getBean("std1");
		System.out.println(stud1);
		StudentDetails stud2 = (StudentDetails) cont.getBean("std2");
		System.out.println(stud2);
	}
}
