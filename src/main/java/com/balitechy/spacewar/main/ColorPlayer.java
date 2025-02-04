package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class ColorPlayer extends Player {
    private static final int SIZE = 56;
    private static final int HEIGHT = 28;
    private static final Color[] COLORS = {Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW, Color.MAGENTA};
    private int colorIndex = 0;

    public ColorPlayer(int x, int y, Game game) {
        super(x, y, game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(COLORS[colorIndex]); // Cambia el color dinámicamente
        colorIndex = (colorIndex + 1) % COLORS.length; // Alterna entre los colores
        
        double[] xPoints = { x, x + SIZE / 2.0, x - SIZE / 2.0 };
        double[] yPoints = { y, y - HEIGHT, y - HEIGHT };
        
        int[] intX = new int[xPoints.length];
        int[] intY = new int[yPoints.length];
        
        for (int i = 0; i < xPoints.length; i++) {
            intX[i] = (int) Math.round(xPoints[i]);
            intY[i] = (int) Math.round(yPoints[i]);
        }
        
        g.fillPolygon(intX, intY, 3);
    }
}