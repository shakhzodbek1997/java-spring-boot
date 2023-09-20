package com.in28minutes.springfreamwork.game;

public class PacManGame implements GamingConsole{
    public void up(){
        System.out.println("PacMan is jumping");
    }
    public void down(){
        System.out.println("PacMan is Sitting");
    }

    public void left(){
        System.out.println("PacMan is turning Left");
    }
    public void right(){
        System.out.println("PacMan is turning Right");
    }
}
