package com.mahes.archit.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};

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
        return new Person("Archit", 24, new Address("Baker Street", "London"));
    }

    @Bean(name="person2")
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean(name="person3")
    public Person person3Parameters(String name, int age, @Qualifier("address3") Address address2){
        return new Person(name, age, address2);
    }

    @Bean(name = "address2")
    @Primary
    public Address address(){
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    public Address address3(){
        return new Address("Potter Street", "Paris");
    }

}
