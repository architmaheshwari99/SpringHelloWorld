package com.mahes.archit.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{


    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Sit");
    }

    public void left() {
        System.out.println("Back");
    }

    public void right() {
        System.out.println("Run");
    }
}
