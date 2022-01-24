package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTest {
	public static void main(String[] args) {
		ApplicationContext con =new ClassPathXmlApplicationContext("ConStructorInj.xml");
		ClassConB ob = (ClassConB)con.getBean("reffB");
		ClassConA oa = (ClassConA) con.getBean("reffA");
		System.out.println(oa);
		System.out.println(ob);
	}

}
