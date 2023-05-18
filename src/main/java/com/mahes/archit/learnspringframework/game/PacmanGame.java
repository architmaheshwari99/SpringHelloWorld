package com.mahes.archit.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{

    public void up() {
        System.out.println("eat up");
    }

    public void down() {
        System.out.println("eat down");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("move fast");
    }

}
