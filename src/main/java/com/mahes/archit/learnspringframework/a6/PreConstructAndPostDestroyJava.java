package com.mahes.archit.learnspringframework.a6;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {

    public SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        this.someDependency = someDependency;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("CleanUp");
    }
}

@Component
class SomeDependency{
    public void getReady() {
        System.out.println("Post Construct");
    }
}

@Configuration
@ComponentScan
public class PreConstructAndPostDestroyJava {



    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(PreConstructAndPostDestroyJava.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(
                System.out::println
        );

    }

}
