package ru.kentolf.screensaver;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Введите текст", "Настройки",JOptionPane.QUESTION_MESSAGE);
        if (input == null || input.trim().isEmpty()) {
            input = "AAA";
        }

        if (input.length() > 10) {
            JOptionPane.showMessageDialog(null, "Слишком длинное слово, оно будет обрезано до 10 букв");
            input = input.substring(0, 10);
        }

        input = input.toUpperCase();

        JFrame frame = new JFrame();

        frame.setSize(1280, 720);

        frame.setTitle("Screensaver");

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Renderer renderer = new Renderer(input);

        frame.add(renderer);

        frame.setVisible(true);
    }
}
