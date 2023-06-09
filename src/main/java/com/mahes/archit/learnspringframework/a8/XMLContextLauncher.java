package com.mahes.archit.learnspringframework.a8;

import com.mahes.archit.learnspringframework.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class XMLContextLauncher {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

        System.out.println(context.getBean("name"));

        context.getBean(GameRunner.class).run();

    }

}
