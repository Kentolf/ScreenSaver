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

    public static Letter createWord(String text) {
        Letter word = new Letter();

        double letterWidth = 4.0;
        double spacing = 1.0;
        double step = letterWidth + spacing;

        double startX = -((text.length() - 1) * step) / 2.0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            double offsetX = startX + i * step;

            switch (c) {
                case 'А':
                case 'A':
                    buildLetterA(word, offsetX);
                    break;
                case 'Г':
                    buildLetterG(word, offsetX);
                    break;
<<<<<<< HEAD
=======
                case 'Н':
                case 'H':
                    buildLetterN(word, offsetX);
                    break;
>>>>>>> 6674853 (full 3D geometry)
                default:
                    break;
            }
        }

        return word;
    }

    private static void buildLetterA(Letter word, double offsetX) {
<<<<<<< HEAD
=======

>>>>>>> 6674853 (full 3D geometry)
        int o = word.vertices.size();

        word.addVertex(-2 + offsetX, -3, -1);
        word.addVertex(-1 + offsetX, -3, -1);
        word.addVertex(0 + offsetX, 1, -1);
        word.addVertex(0 + offsetX, 3, -1);
        word.addVertex(2 + offsetX, -3, -1);
        word.addVertex(1 + offsetX, -3, -1);
        word.addVertex(-0.5 + offsetX, -1, -1);
        word.addVertex(0.5 + offsetX, -1, -1);
        word.addVertex(0.25 + offsetX, 0, -1);
        word.addVertex(-0.25 + offsetX, 0, -1);

<<<<<<< HEAD
        word.addVertex(-2 + offsetX, -3, 1);
        word.addVertex(-1 + offsetX, -3, 1);
        word.addVertex(0 + offsetX, 1, 1);
        word.addVertex(0 + offsetX, 3, 1);
        word.addVertex(2 + offsetX, -3, 1);
        word.addVertex(1 + offsetX, -3, 1);
        word.addVertex(-0.5 + offsetX, -1, 1);
        word.addVertex(0.5 + offsetX, -1, 1);
        word.addVertex(0.25 + offsetX, 0, 1);
        word.addVertex(-0.25 + offsetX, 0, 1);

=======

        word.addVertex(-2 + offsetX, -3, 1);
        word.addVertex(-1 + offsetX, -3, 1);
        word.addVertex(0 + offsetX, 1, 1);
        word.addVertex(0 + offsetX, 3, 1);
        word.addVertex(2 + offsetX, -3, 1);
        word.addVertex(1 + offsetX, -3, 1);
        word.addVertex(-0.5 + offsetX, -1, 1);
        word.addVertex(0.5 + offsetX, -1, 1);
        word.addVertex(0.25 + offsetX, 0, 1);
        word.addVertex(-0.25 + offsetX, 0, 1);

>>>>>>> 6674853 (full 3D geometry)
        word.addFace(new Color(200, 0, 0), 0+o, 1+o, 2+o, 3+o);
        word.addFace(new Color(200, 0, 0), 3+o, 2+o, 5+o, 4+o);
        word.addFace(new Color(200, 0, 0), 6+o, 7+o, 8+o, 9+o);

        word.addFace(new Color(0, 0, 200), 10+o, 11+o, 12+o, 13+o);
        word.addFace(new Color(0, 0, 200), 13+o, 12+o, 15+o, 14+o);
        word.addFace(new Color(0, 0, 200), 16+o, 17+o, 18+o, 19+o);

        word.addFace(Color.GRAY, 0+o, 3+o, 13+o, 10+o);
        word.addFace(Color.GRAY, 4+o, 3+o, 13+o, 14+o);
        word.addFace(Color.GRAY, 1+o, 2+o, 12+o, 11+o);
        word.addFace(Color.GRAY, 2+o, 5+o, 15+o, 12+o);
        word.addFace(Color.DARK_GRAY, 6+o, 7+o, 17+o, 16+o);
        word.addFace(Color.DARK_GRAY, 9+o, 8+o, 18+o, 19+o);
        word.addFace(Color.GRAY, 6+o, 9+o, 19+o, 16+o);
        word.addFace(Color.GRAY, 7+o, 8+o, 18+o, 17+o);
        word.addFace(Color.DARK_GRAY, 0+o, 1+o, 11+o, 10+o);
        word.addFace(Color.DARK_GRAY, 4+o, 5+o, 15+o, 14+o);
    }

    private static void buildLetterG(Letter word, double offsetX) {
        int o = word.vertices.size();

        word.addVertex(-2 + offsetX, -3, -1);
        word.addVertex(-1 + offsetX, -3, -1);
        word.addVertex(-1 + offsetX, 2, -1);
        word.addVertex(2 + offsetX, 2, -1);
        word.addVertex(2 + offsetX, 3, -1);
        word.addVertex(-2 + offsetX, 3, -1);

        word.addVertex(-2 + offsetX, -3, 1);
        word.addVertex(-1 + offsetX, -3, 1);
        word.addVertex(-1 + offsetX, 2, 1);
        word.addVertex(2 + offsetX, 2, 1);
        word.addVertex(2 + offsetX, 3, 1);
        word.addVertex(-2 + offsetX, 3, 1);

        word.addFace(new Color(200, 0, 0), 0+o, 1+o, 2+o, 5+o);
        word.addFace(new Color(200, 0, 0), 2+o, 3+o, 4+o, 5+o);
        word.addFace(new Color(0, 0, 200), 6+o, 7+o, 8+o, 11+o);
        word.addFace(new Color(0, 0, 200), 8+o, 9+o, 10+o, 11+o);

        word.addFace(Color.DARK_GRAY, 0+o, 1+o, 7+o, 6+o);
        word.addFace(Color.GRAY, 1+o, 2+o, 8+o, 7+o);
        word.addFace(Color.DARK_GRAY, 2+o, 3+o, 9+o, 8+o);
        word.addFace(Color.GRAY, 3+o, 4+o, 10+o, 9+o);
        word.addFace(Color.DARK_GRAY, 5+o, 4+o, 10+o, 11+o);
        word.addFace(Color.GRAY, 0+o, 5+o, 11+o, 6+o);
<<<<<<< HEAD
=======
    }

    private static void buildLetterN(Letter word, double offsetX) {
        int o = word.vertices.size();

        word.addVertex(-2 + offsetX, -3, -1);
        word.addVertex(-1 + offsetX, -3, -1);
        word.addVertex(-1 + offsetX, -0.5, -1);
        word.addVertex(1 + offsetX, -0.5, -1);
        word.addVertex(1 + offsetX, -3, -1);
        word.addVertex(2 + offsetX, -3, -1);
        word.addVertex(2 + offsetX, 3, -1);
        word.addVertex(1 + offsetX, 3, -1);
        word.addVertex(1 + offsetX, 0.5, -1);
        word.addVertex(-1 + offsetX, 0.5, -1);
        word.addVertex(-1 + offsetX, 3, -1);
        word.addVertex(-2 + offsetX, 3, -1);

        word.addVertex(-2 + offsetX, -3, 1);
        word.addVertex(-1 + offsetX, -3, 1);
        word.addVertex(-1 + offsetX, -0.5, 1);
        word.addVertex(1 + offsetX, -0.5, 1);
        word.addVertex(1 + offsetX, -3, 1);
        word.addVertex(2 + offsetX, -3, 1);
        word.addVertex(2 + offsetX, 3, 1);
        word.addVertex(1 + offsetX, 3, 1);
        word.addVertex(1 + offsetX, 0.5, 1);
        word.addVertex(-1 + offsetX, 0.5, 1);
        word.addVertex(-1 + offsetX, 3, 1);
        word.addVertex(-2 + offsetX, 3, 1);

        word.addFace(new Color(200, 0, 0), 0+o, 1+o, 10+o, 11+o);
        word.addFace(new Color(200, 0, 0), 2+o, 3+o, 8+o, 9+o);
        word.addFace(new Color(200, 0, 0), 4+o, 5+o, 6+o, 7+o);

        word.addFace(new Color(0, 0, 200), 12+o, 13+o, 22+o, 23+o);
        word.addFace(new Color(0, 0, 200), 14+o, 15+o, 20+o, 21+o);
        word.addFace(new Color(0, 0, 200), 16+o, 17+o, 18+o, 19+o);

        word.addFace(Color.DARK_GRAY, 0+o, 1+o, 13+o, 12+o);
        word.addFace(Color.GRAY, 1+o, 2+o, 14+o, 13+o);
        word.addFace(Color.DARK_GRAY, 2+o, 3+o, 15+o, 14+o);
        word.addFace(Color.GRAY, 3+o, 4+o, 16+o, 15+o);
        word.addFace(Color.DARK_GRAY, 4+o, 5+o, 17+o, 16+o);
        word.addFace(Color.GRAY, 5+o, 6+o, 18+o, 17+o);
        word.addFace(Color.DARK_GRAY, 6+o, 7+o, 19+o, 18+o);
        word.addFace(Color.GRAY, 7+o, 8+o, 20+o, 19+o);
        word.addFace(Color.DARK_GRAY, 8+o, 9+o, 21+o, 20+o);
        word.addFace(Color.GRAY, 9+o, 10+o, 22+o, 21+o);
        word.addFace(Color.DARK_GRAY, 10+o, 11+o, 23+o, 22+o);
        word.addFace(Color.GRAY, 11+o, 0+o, 12+o, 23+o);
>>>>>>> 6674853 (full 3D geometry)
    }
}
