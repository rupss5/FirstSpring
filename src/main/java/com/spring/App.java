package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
		
		 ApplicationContext a=new ClassPathXmlApplicationContext("com/spring/Myxml.xml");
		  
	 
		 Mark s1=a.getBean("mark",Mark.class); 
		 System.out.println(s1);
		 
			/*
			 * ApplicationContext a1=new
			 * ClassPathXmlApplicationContext("com/spring/Myxml.xml");
			 * 
			 * 
			 * Student s2=a1.getBean("Stud2",Student.class); System.out.println(s2); Student
			 * s=new Student(103,"Jivan","Mumbai"); System.out.println(s);
			 */
		 
    	
//    	FileSystemResource res=new FileSystemResource("src/main/java/com/spring/config/Myxml.xml");
//    	XmlBeanFactory factory=new XmlBeanFactory(res);
//    	Student stu=(Student)factory.getBean("Stud1");
//    	System.out.println(stu);
    	
    	
    	
    }
}