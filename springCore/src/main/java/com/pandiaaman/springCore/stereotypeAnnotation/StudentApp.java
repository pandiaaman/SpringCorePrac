package com.pandiaaman.springCore.stereotypeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pandiaaman/springCore/stereotypeAnnotation/StereotypeAnnotationSpringConfig.xml");
		
		Student st1 = context.getBean("studentOne", Student.class);
		System.out.println(st1);
	}
	
	
	
	
}
