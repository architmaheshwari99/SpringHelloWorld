package com.mahes.archit.learnspringframework;

import com.mahes.archit.learnspringframework.game.GameRunner;
import com.mahes.archit.learnspringframework.game.GamingConsole;
import com.mahes.archit.learnspringframework.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class GameConfiguration {
    @Bean
    public GamingConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner runner(GamingConsole game){
        return new GameRunner(game);
    }
}


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
