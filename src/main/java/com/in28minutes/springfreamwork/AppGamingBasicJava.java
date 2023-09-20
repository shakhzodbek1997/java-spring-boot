package com.in28minutes.springfreamwork;

import com.in28minutes.springfreamwork.game.GameRunner;
import com.in28minutes.springfreamwork.game.PacManGame;

public class AppGamingBasicJava {
	public static void main(String[] args) {
		
//		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();
		var game = new PacManGame();
		var runTheGame = new GameRunner(game);
		runTheGame.run();
	}
}