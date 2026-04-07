package ru.kentolf.screensaver;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private final Letter a;
    private int posX = 200;
    private int posY = 200;
    private int dx = 3;
    private int dy = 2;
    private final int halfHeight = 150;  // нужны, так как буква не долетает до рамок
    private final int scale = 50;

    public Renderer() {

        this.a = Letter.createLetterA();

        Timer timer = new Timer(16, e -> {

            for (int i = 0; i < a.vertices.size(); i++) {
                Vector v = a.vertices.get(i);
                v.rotateY(0.02);
            }

            posX += dx;
            posY += dy;

            double maxAbsX = 0;
            for (int i = 0; i < a.vertices.size(); i++) {
                Vector v = a.vertices.get(i);
                if (Math.abs(v.x) > maxAbsX) {
                    maxAbsX = Math.abs(v.x);
                }
            }

            int dynamicHalfWidth = (int) (maxAbsX * scale);

            int paddingY = 15;

            if (posX - dynamicHalfWidth < 0) {
                posX = dynamicHalfWidth;
                dx = -dx;

            }
            else if (posX + dynamicHalfWidth > getWidth()) {
                posX = getWidth() - dynamicHalfWidth;
                dx = -dx;
            }

            if (posY - halfHeight < 0) {
                posY = halfHeight;
                dy = -dy;

            }
            else if (posY + halfHeight > getHeight() - paddingY) {
                posY = getHeight() - halfHeight - paddingY;
                dy = -dy;
            }

            repaint();

        });

        timer.start();
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        for (int i = 0; i < a.edges.size(); i++) {
            Edge edge = a.edges.get(i);

            Vector v1 = a.vertices.get(edge.start);
            Vector v2 = a.vertices.get(edge.end);

            int x1 = (int) (v1.x * scale) + posX;
            int y1 = (int) (-v1.y * scale) + posY;
            int x2 = (int) (v2.x * scale) + posX;
            int y2 = (int) (-v2.y * scale) + posY;

            g.drawLine(x1,y1,x2,y2);
        }
    }
}