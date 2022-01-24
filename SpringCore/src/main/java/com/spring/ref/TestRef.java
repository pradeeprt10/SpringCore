package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("Reference.xml");
		ClassB reffb = (ClassB) cxt.getBean("referenceb");
		ClassA reffa = (ClassA) cxt.getBean("referencea");
		System.out.println(reffb);
		System.out.println(reffa);
	}
}
