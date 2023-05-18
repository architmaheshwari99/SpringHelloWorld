package com.mahes.archit.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {

    public static void main(String[] args) {

//      1.  Launch a spring context

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

//      2.  Configure the things we want Spring to manage @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("person3"));



    }

}
