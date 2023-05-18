package com.mahes.archit.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicJava {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        var pacman = context.getBean(GamingConsole.class);
        pacman.up();

//        var runner =  context.getBean(GameRunner.class);
//        runner.run();

        context.getBean(GameRunner.class).run();

    }

}
