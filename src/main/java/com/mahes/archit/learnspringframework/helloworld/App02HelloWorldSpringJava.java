package com.mahes.archit.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpringJava {

    public static void main(String[] args) {

//      1.  Launch a spring context

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

//      2.  Configure the things we want Spring to manage @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person2"));

//      As we are using @Qualifier, person3 will have the specific wired bean
            System.out.println(context.getBean("person3"));


            Arrays.stream(context.getBeanDefinitionNames()).forEach(
                    System.out::println
            );


        }

    }

}
