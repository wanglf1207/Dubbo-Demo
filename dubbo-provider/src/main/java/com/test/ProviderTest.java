package com.test;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {
	
    public static void main(String[] args) {
    	
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();

        System.out.println("Dubbo provider start...");

        // 如果不加这个，spring j2se应用会随着jvm关闭而关闭。
        try {
            System.in.read();   // 按任意键退出
        } catch (IOException e) {
            e.printStackTrace();
        }
        ((ConfigurableApplicationContext)context).close();
    }
}