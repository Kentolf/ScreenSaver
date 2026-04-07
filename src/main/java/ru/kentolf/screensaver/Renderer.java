package ru.kentolf.screensaver;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private Letter a;

    public Renderer() {

        this.a = Letter.createLetterA();

        Timer timer = new Timer(16, e -> {

            for (int i = 0; i < a.vertices.size(); i++) {
                Vector v = a.vertices.get(i);
                v.rotateY(0.02);
            }

            repaint();

        });

        timer.start();
    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        int scale = 50;
        int offsetX = getWidth() / 2;  // потому что не влазиет
        int offsetY = getHeight() / 2 + 150;

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