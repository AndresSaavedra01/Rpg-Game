package game.view;

import game.controller.BattleController;

import javax.swing.*;
import java.awt.*;


public class BattlePanel extends JPanel {

    public BattlePanel() {
        setLayout(new BorderLayout());
        add( new ButtonsPanel(), BorderLayout.SOUTH);
        add( new DisplayBattle(), BorderLayout.CENTER);
    }
}