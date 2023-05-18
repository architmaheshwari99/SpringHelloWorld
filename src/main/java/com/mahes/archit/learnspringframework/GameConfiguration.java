package com.mahes.archit.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {


    @Bean
    public GamingConsole game(){
        return new MarioGame();
    }

    @Bean
    public GameRunner runner(GamingConsole game){
        return new GameRunner(game);
    }

}
