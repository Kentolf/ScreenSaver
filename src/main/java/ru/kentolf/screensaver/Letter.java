package ru.kentolf.screensaver;

import java.util.ArrayList;
import java.util.List;

class Letter {
    public List<Vector> vertices = new ArrayList();
    public List<Edge> edges = new ArrayList<>();

    public void addVertex(double x, double y, double z) {
        vertices.add(new Vector(x,y,z));
    }

    public void addEdge(int start, int end) {
        edges.add(new Edge (start,end));
    }

    public static Letter createLetterA() {
        Letter a = new Letter();

        a.addVertex(-2, -3, 0);
        a.addVertex(0, 3, 0);
        a.addVertex(2, -3, 0);
        a.addVertex(-1, 0, 0);
        a.addVertex(1, 0, 0);

        a.addEdge(0, 1);
        a.addEdge(1, 2);
        a.addEdge(3, 4);

        return a;
    }
}
