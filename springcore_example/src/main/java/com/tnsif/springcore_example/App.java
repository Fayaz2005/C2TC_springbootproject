package com.tnsif.springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        
        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");
        
        College c1 = var.getBean("smvc", College.class);
        c1.display();
        
        College c2 = var.getBean("mvit", College.class);
        c2.display();
    }
}
