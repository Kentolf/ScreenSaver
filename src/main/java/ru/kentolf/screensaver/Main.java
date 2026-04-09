package ru.kentolf.screensaver;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Введите текст", "Настройки",JOptionPane.QUESTION_MESSAGE);
        if (input == null || input.trim().isEmpty()) {
            input = "AAA";
        }

        input = input.toUpperCase();

        if (input.length() > 6) {
            input = input.substring(0, 6);
        }

        JFrame frame = new JFrame();

        frame.setSize(800, 600);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Renderer renderer = new Renderer(input);

        frame.add(renderer);

        frame.setVisible(true);
    }
}
