package ru.kentolf.screensaver;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private final Letter a;
    private int posX = 200;
    private int posY = 200;
    private int dx = 3;
    private int dy = 2;
    private final int halfHeight;
    private final int scale;
    private final int paddingY = 15;

    public Renderer(String text) {
        this.scale = Math.max(1200 / (text.length() * 5), 20);
        this.halfHeight = 3 * scale;
        this.a = Letter.createWord(text);

        Timer timer = new Timer(16, e -> {

            for (int i = 0; i < a.vertices.size(); i++) {
                Vector v = a.vertices.get(i);
                v.rotateY(0.02);
            }

            posX += dx;
            posY += dy;

            double maxRadius = 0;
            for (int i = 0; i < a.vertices.size(); i++) {
                Vector v = a.vertices.get(i);
                double radius = Math.sqrt(v.x * v.x + v.z * v.z);
                if (radius > maxRadius) {
                    maxRadius = radius;
                }
            }

            int dynamicHalfWidth = (int) (maxRadius * scale);

            if (posX - dynamicHalfWidth < 0) {
                posX = dynamicHalfWidth;
                dx = -dx;

            }
            else
                if (posX + dynamicHalfWidth > getWidth()) {
                posX = getWidth() - dynamicHalfWidth;
                dx = -dx;
            }

            if (posY - halfHeight < 0) {
                posY = halfHeight;
                dy = -dy;

            }
            else
                if (posY + halfHeight > getHeight() - paddingY) {
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

        for (int i = 0; i < a.faces.size(); i++) {
            Face currentFace = a.faces.get(i);
            currentFace.calculateDepth(a.vertices);
        }

        a.faces.sort((f1, f2) -> Double.compare(f2.depth, f1.depth));

        for (int j = 0; j < a.faces.size(); j++) {
            Face face = a.faces.get(j);

            int pointCount = face.vertexIndices.length;
            int[] xPoints = new int[pointCount];
            int[] yPoints = new int[pointCount];

            for (int i = 0; i < pointCount; i++) {
                int vertexIndex = face.vertexIndices[i];
                Vector v = a.vertices.get(vertexIndex);
                xPoints[i] = (int) (v.x * scale) + posX;
                yPoints[i] = (int) (-v.y * scale) + posY;
            }

            g.setColor(face.color);
            g.fillPolygon(xPoints, yPoints, pointCount);
        }
    }
}