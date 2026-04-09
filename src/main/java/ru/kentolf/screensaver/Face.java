package ru.kentolf.screensaver;

import java.awt.Color;

public class Face {
    public int[] vertexIndices;
    public Color color;

    public Face(Color color, int ... indices) {
        this.vertexIndices = indices;
        this.color = color;
    }
}
