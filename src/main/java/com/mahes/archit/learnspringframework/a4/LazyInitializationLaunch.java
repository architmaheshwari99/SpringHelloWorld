package com.mahes.archit.learnspringframework.a4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Init");
        this.classA = classA;
    }
}


@Configuration
@ComponentScan
public class LazyInitializationLaunch {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(LazyInitializationLaunch.class);

        System.out.println(context.getBean(ClassB.class));

    }

}
