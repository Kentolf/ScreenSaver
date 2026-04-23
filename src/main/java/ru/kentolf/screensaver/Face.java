package ru.kentolf.screensaver;

import java.awt.Color;
import java.util.List;

public class Face {
    public int[] vertexIndices;
    public Color color;
    public double depth;

    public Face(Color color, int ... indices) {
        this.vertexIndices = indices;
        this.color = color;
    }

    public void calculateDepth(List<Vector> vertices) {
        double sumZ = 0;
        for (int i = 0; i < vertexIndices.length; i++) {
            int index = vertexIndices[i];
            sumZ += vertices.get(index).z;
        }
        this.depth = sumZ / vertexIndices.length;
    }
}
