package ru.geekbrains.lesson4;

import javax.swing.*;

public class SmingApp {

    private static MainWindow mainWindow;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWindow = new MainWindow();
            }
        });

    }
}
