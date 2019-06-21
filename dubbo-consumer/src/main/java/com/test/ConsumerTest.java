package com.test;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
	
    public static void main(String[] args) {
    	
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:applicationContext.xml" });

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        System.out.println(demoService.sayHello("ki"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ((ConfigurableApplicationContext)context).close();
    }
}