package com.car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext  Context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        //container se bean liya hai
        Mybean mybean = (Mybean) Context.getBean("mybean");
        System.out.println(mybean);
    }
}
