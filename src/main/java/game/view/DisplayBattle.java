package game.view;

import game.controller.BattleController;

import javax.swing.*;
import java.awt.*;

public class DisplayBattle extends JPanel {

    static private BattleController battleController =  new BattleController();
    static private CharacterPanelContainer enemiesContainer =  new CharacterPanelContainer(battleController.getManager().getEnemies());
    static private CharacterPanelContainer alliesContainer =  new CharacterPanelContainer(battleController.getManager().getAllies());

    public DisplayBattle() {
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
