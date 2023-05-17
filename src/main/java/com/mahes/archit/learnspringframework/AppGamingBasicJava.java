package com.mahes.archit.learnspringframework;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
// We would need to change GameRunner constructor
//  to run contraGame. This is tight coupling
        var contraGame = new ContraGame();
        var gameRunner = new GameRunner(marioGame);

        gameRunner.run();


    }

}
