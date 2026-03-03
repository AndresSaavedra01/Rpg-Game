package game.view;

import game.controller.BattleController;

import javax.swing.*;

public class StartPanel extends JPanel {

    JButton start = new JButton("Start");

    public StartPanel() {
        start.addActionListener(new BattleController());
        add(start);
    }
}
