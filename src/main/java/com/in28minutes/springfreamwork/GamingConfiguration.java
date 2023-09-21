package com.in28minutes.springfreamwork;

import com.in28minutes.springfreamwork.game.GameRunner;
import com.in28minutes.springfreamwork.game.GamingConsole;
import com.in28minutes.springfreamwork.game.PacManGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {


    // Creating a PacMan game and Wiring it ----->
    @Bean
    public GamingConsole game(){
        var newPacManGame = new PacManGame();
        return  newPacManGame;
    }
    // ---> wiring the created Pacman game to the GameRunner
    @Bean
    public GameRunner gameRunner (GamingConsole game){
        var newGameRunner = new GameRunner(game);
        return  newGameRunner;
    }
}
