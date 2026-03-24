package game.view;

import game.controller.BattleController;

import javax.swing.*;
import java.awt.*;

public class DisplayBattle extends JPanel {

    static private CharacterPanelContainer enemiesContainer;
    static private CharacterPanelContainer alliesContainer;

    public DisplayBattle() {
        enemiesContainer = new CharacterPanelContainer(Window.battleController.getManager().getEnemies());
        alliesContainer = new CharacterPanelContainer(Window.battleController.getManager().getAllies());
        setBackground(Color.DARK_GRAY);
        setBorder(Borders.classicBorder);

        setLayout(new GridLayout(1,2,10,10));
        add(enemiesContainer);
        add(alliesContainer);


    }

    public static CharacterPanelContainer getEnemiesContainer() {
        return enemiesContainer;
    }

    public static CharacterPanelContainer getAlliesContainer() {
        return alliesContainer;
    }
}
