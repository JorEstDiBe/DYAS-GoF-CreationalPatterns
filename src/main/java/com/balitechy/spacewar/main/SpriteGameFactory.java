/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

/**
 *
 * @author Laura
 */
public class SpriteGameFactory implements GameFactory {

    @Override
    public Player createPlayer(int x, int y, Game game) {
        return new Player(x, y, game); // Usamos la versión sprite del jugador
    }

    @Override
    public BulletController createBulletController() {
        return new BulletController();
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new BackgroundRenderer(false,false); // false para sprite
    }
}

