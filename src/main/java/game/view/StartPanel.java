package game.view;

import game.controller.BattleController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {

    JButton start = new JButton("Start");

    public StartPanel(JPanel w, CardLayout cardLayout) {
        add(start);
        start.addActionListener(e -> cardLayout.show(w, "battle"));
    }
}
