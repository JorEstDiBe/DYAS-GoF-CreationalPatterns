/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.balitechy.spacewar.main;

/**
 *
 * @author Laura
 */
public interface GameFactory {
    
    Player createPlayer(int x, int y, Game game);
    BulletController createBulletController();
    BackgroundRenderer createBackgroundRenderer();
   
    
}
