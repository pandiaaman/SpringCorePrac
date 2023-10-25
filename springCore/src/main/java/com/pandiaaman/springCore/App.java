package com.pandiaaman.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pandiaaman.springCore.dbConnection.DBDetails;
import com.pandiaaman.springCore.management.Manager;
import com.pandiaaman.springCore.student.Student;
import com.pandiaaman.springCore.teacher.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello to spring World!" );
    	ApplicationContext studentContext = new ClassPathXmlApplicationContext("com/pandiaaman/springCore/student/StudentSpringConfig.xml");
    	ApplicationContext teacherContext = new ClassPathXmlApplicationContext("com/pandiaaman/springCore/teacher/TeacherSpringConfig.xml");
    	ApplicationContext dbDetailsContext = new ClassPathXmlApplicationContext("com/pandiaaman/springCore/dbConnection/DBConnectionSpringConfig.xml");    	
    	ApplicationContext managerContext = new ClassPathXmlApplicationContext("com/pandiaaman/springCore/management/ManagerSpringConfig.xml");
    			
    	Student stud1 = (Student) studentContext.getBean("studentOne");
    	
    	Student stud2 = (Student) studentContext.getBean("studentTwo");
    	
    	Student stud3 = (Student) studentContext.getBean("studentThree");
    	
    	
    	Teacher teach1 = (Teacher) teacherContext.getBean("teacherOne");
    	
    	Teacher teach2 = (Teacher) teacherContext.getBean("teacherTwo");
    	
    	DBDetails dbDetails = (DBDetails) dbDetailsContext.getBean("dbConnObject");
    	
    	Manager manager1 = (Manager) managerContext.getBean("managerOne");
    	
    	System.out.println(stud1);
    	System.out.println(stud2);
    	System.out.println(stud3);
    	
    	System.out.println(teach1);
    	System.out.println(teach2);
    	
    	System.out.println(dbDetails);
    	
    	System.out.println(manager1);
    }
}
