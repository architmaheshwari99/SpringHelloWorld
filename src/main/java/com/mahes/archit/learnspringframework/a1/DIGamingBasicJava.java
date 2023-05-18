package com.mahes.archit.learnspringframework.a1;

import com.mahes.archit.learnspringframework.game.GameRunner;
import com.mahes.archit.learnspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class DIGamingBasicJava {



    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(DIGamingBasicJava.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

    }

}
