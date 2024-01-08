package br.com.pokedex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

     private static void createAndShowGUI() {
        JFrame frame = new JFrame("Pokedex App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int width = 400;
        int height = 200;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;

        frame.setBounds(x, y, width, height);

        JLabel welcomeLabel = new JLabel("Bem-vindo ao Pokedex!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

        JButton openPokedexButton = new JButton("Abrir Pokedex");
        openPokedexButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Pokedex aberto!");
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(welcomeLabel, BorderLayout.CENTER);
        panel.add(openPokedexButton, BorderLayout.SOUTH);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}