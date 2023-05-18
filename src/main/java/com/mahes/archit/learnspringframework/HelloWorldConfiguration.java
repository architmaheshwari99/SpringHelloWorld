package com.mahes.archit.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

record Address(String firstLine, String city) {};


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Maheshwari";
    }

    @Bean
    public int age(){
        return 24;
    }

    @Bean
    public Person person(){
        return new Person("Archit", 24);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("Baker Street", "London");
    }

}
