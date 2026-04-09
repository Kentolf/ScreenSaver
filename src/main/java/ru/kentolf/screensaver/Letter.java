package ru.kentolf.screensaver;

import java.util.ArrayList;
import java.util.List;
import java.awt.Color;

class Letter {
    public List<Vector> vertices = new ArrayList();
    public List<Face> faces = new ArrayList<>();

    public void addVertex(double x, double y, double z) {
        vertices.add(new Vector(x,y,z));
    }

    public void addFace(Color color, int... indices) {
        faces.add(new Face(color, indices));
    }

    public static Letter createLetterA() {
        Letter a = new Letter();

        a.addVertex(-2, -3, 0);
        a.addVertex(-1, -3, 0);
        a.addVertex(0, 1, 0);
        a.addVertex(0, 3, 0);

        a.addVertex(2, -3, 0);
        a.addVertex(1, -3, 0);

        a.addVertex(-0.5, -1, 0);
        a.addVertex(0.5, -1, 0);
        a.addVertex(0.25, 0, 0);
        a.addVertex(-0.25, 0, 0);

        a.addFace(Color.RED, 0, 1, 2, 3);
        a.addFace(Color.RED, 3, 2, 5, 4);
        a.addFace(Color.RED, 6, 7, 8, 9);


        a.addVertex(-2, -3, 2);
        a.addVertex(-1, -3, 2);
        a.addVertex(0, 1, 2);
        a.addVertex(0, 3, 2);
        a.addVertex(2, -3, 2);
        a.addVertex(1, -3, 2);
        a.addVertex(-0.5, -1, 2);
        a.addVertex(0.5, -1, 2);
        a.addVertex(0.25, 0, 2);
        a.addVertex(-0.25, 0, 2);

        a.addFace(Color.BLUE, 10, 11, 12, 13);
        a.addFace(Color.BLUE, 13, 12, 15, 14);
        a.addFace(Color.BLUE, 16, 17, 18, 19);

        return a;
    }
}
