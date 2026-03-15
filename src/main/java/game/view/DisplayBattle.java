package game.view;

import javax.swing.*;
import java.awt.*;

public class DisplayBattle extends JPanel {

   static private CharacterPanelContainer enemiesContainer =  new CharacterPanelContainer();
   static private CharacterPanelContainer alliesContainer =  new CharacterPanelContainer();

    public DisplayBattle() {
        setBackground(Color.ORANGE);
        setBorder(Borders.classicBorder);

        setLayout(new GridLayout(1,2,10,10));
        add(alliesContainer);
        add(enemiesContainer);
    }

    public static CharacterPanelContainer getEnemiesContainer() {
        return enemiesContainer;
    }

    public static CharacterPanelContainer getAlliesContainer() {
        return alliesContainer;
    }
}
