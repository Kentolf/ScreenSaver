package ru.kentolf.screensaver;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        Letter a = Letter.createLetterA();

        int scale = 50;
        int offsetX = 200;
        int offsetY = 100;

        for (int i = 0; i < a.edges.size(); i++) {
            Edge edge = a.edges.get(i);

            Vector v1 = a.vertices.get(edge.start);
            Vector v2 = a.vertices.get(edge.end);

            int x1 = (int) (v1.x * scale) + offsetX;
            int y1 = (int) (-v1.y * scale) + offsetY;
            int x2 = (int) (v2.x * scale) + offsetX;
            int y2 = (int) (-v2.y * scale) + offsetY;

            g.drawLine(x1,y1,x2,y2);
        }
    }
}