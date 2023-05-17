package com.mahes.archit.learnspringframework;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();

        var contraGame = new ContraGame();

        var pacmanGame = new PacmanGame();
//  Using GamingConsole in the gameRunner class to enable loose coupling
//  of runner and game.
        var gameRunner = new GameRunner(contraGame);

        gameRunner.run();


    }

}
