package com.mahes.archit.learnspringframework.a3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class ExerciseSpringBean {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ExerciseSpringBean.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

        System.out.println(context.getBean(BusinessCalculationService.class).findMax());



    }

}
