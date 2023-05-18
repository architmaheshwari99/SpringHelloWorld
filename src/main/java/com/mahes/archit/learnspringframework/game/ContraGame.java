package com.mahes.archit.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContraGame implements GamingConsole{

    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Aim");
    }

    public void left() {
        System.out.println("Run back");
    }

    public void right() {
        System.out.println("Shoot");
    }

}
