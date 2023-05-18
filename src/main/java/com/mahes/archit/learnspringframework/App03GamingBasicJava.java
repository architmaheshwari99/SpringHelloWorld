package com.mahes.archit.learnspringframework;

import com.mahes.archit.learnspringframework.game.GameRunner;
import com.mahes.archit.learnspringframework.game.GamingConsole;
import com.mahes.archit.learnspringframework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class App03GamingBasicJava {

    @Bean
    public GamingConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner runner(GamingConsole game){
        return new GameRunner(game);
    }

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(App03GamingBasicJava.class);

        var pacman = context.getBean(GamingConsole.class);

        context.getBean(GameRunner.class).run();

    }

}
