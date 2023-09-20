package com.in28minutes.springfreamwork;

import com.in28minutes.springfreamwork.game.GameRunner;
import com.in28minutes.springfreamwork.game.PacManGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
		
//		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}