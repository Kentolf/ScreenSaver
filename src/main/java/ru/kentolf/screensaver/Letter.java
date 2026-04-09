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

        a.addFace(new Color(200, 0, 0), 0, 1, 2, 3);
        a.addFace(new Color(200, 0, 0), 3, 2, 5, 4);
        a.addFace(new Color(200, 0, 0), 6, 7, 8, 9);

        a.addFace(new Color(0, 0, 200), 10, 11, 12, 13);
        a.addFace(new Color(0, 0, 200), 13, 12, 15, 14);
        a.addFace(new Color(0, 0, 200), 16, 17, 18, 19);

        a.addFace(Color.GRAY, 0, 3, 13, 10);
        a.addFace(Color.GRAY, 4, 3, 13, 14);
        a.addFace(Color.DARK_GRAY, 0, 1, 11, 10);
        a.addFace(Color.DARK_GRAY, 4, 5, 15, 14);

        return a;
    }
}
