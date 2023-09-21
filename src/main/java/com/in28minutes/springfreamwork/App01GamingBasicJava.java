package com.in28minutes.springfreamwork;

import com.in28minutes.springfreamwork.game.GameRunner;
import com.in28minutes.springfreamwork.game.PacManGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
//		var marioGame = new MarioGame();
//		var superContraGame = new SuperContraGame();

		var game = new PacManGame(); // 1. Object creation

		var gameRunner = new GameRunner(game);
		// 2. Object Creation + Wiring of Dependencies
		// Game is a Dependency of Game Runner
		gameRunner.run();
	}
}