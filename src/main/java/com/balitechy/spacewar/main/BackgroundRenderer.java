package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BackgroundRenderer {

    private boolean isVectorMode, isColorMode; 

    public BackgroundRenderer(boolean isVectorMode, boolean isColorMode) {
        this.isVectorMode = isVectorMode;
        this.isColorMode = isColorMode;
    }

    public void render(Graphics g, Canvas c) throws IOException {
        if (isVectorMode) {
            renderBackground(g, c, Color.WHITE);  //modo vectorial
        } else if(isColorMode){
            renderBackground(g, c, Color.CYAN);   //modo color
        } else { 
            renderS(g,c); //modo sprite 
        }
    }

    public void renderS(Graphics g, Canvas c) throws IOException {
        BufferedImage background = null;
        SpritesImageLoader bg = new SpritesImageLoader("/bg.png");
        bg.loadImage();
        background = bg.getImage(0, 0, 640, 480);
        g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
    }

    private void renderBackground(Graphics g, Canvas c, Color backgroundColor) {
        g.setColor(backgroundColor);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.BLACK);
        g.drawOval(20, 20, 100, 100);
    }
}

