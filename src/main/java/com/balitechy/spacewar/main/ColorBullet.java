package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class ColorBullet {
    private double x;
    private double y;
    public static final int WIDTH = 11;
    public static final int HEIGHT = 21;
    private Color color;
    private static final Random random = new Random();

    public ColorBullet(double x, double y) {
        this.x = x;
        this.y = y;
        this.color = getRandomColor();
    }

    public void tick() {
        y -= 5;
    }

    public void render(Graphics g) {
        color = getRandomColor(); // Cambia de color aleatoriamente en cada renderizado
        g.setColor(color);
        g.drawLine((int) x, (int) y, (int) x, (int) (y - 10));
    }

    private Color getRandomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public double getY() {
        return y;
    }
}
