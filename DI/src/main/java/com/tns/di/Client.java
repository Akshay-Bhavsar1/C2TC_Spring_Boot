package com.tns.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext c =new ClassPathXmlApplicationContext("beans.xml");
		
		Student s1 = c.getBean("s1",Student.class);
		s1.cheating();
		
		Student2 s2 = c.getBean("s2",Student2.class);
		s2.cheating();

	}

}
