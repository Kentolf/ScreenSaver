package ru.kentolf.screensaver;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(800, 600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Renderer renderer = new Renderer();

        frame.add(renderer);

        frame.setVisible(true);
    }
}
