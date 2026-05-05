package game.view;

import game.model.logic.Battle;
import game.model.logic.CharacterManager;

import javax.swing.*;
import java.awt.*;

public class BattlePanel extends JPanel {

    PartyPanel rivalsPanel;
    PartyPanel partnersPanel;


    public BattlePanel(CharacterManager manager) {
        JPanel mainPanel =  new JPanel();
        setLayout(null);
        mainPanel.setBounds(0, 50, 1080, 600);

        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        mainPanel.setBackground(Color.CYAN);

        rivalsPanel = new PartyPanel(manager.getEnemies());
        partnersPanel =  new PartyPanel(manager.getAllies());
        setBackground(Color.CYAN);
        mainPanel.add(rivalsPanel);
        mainPanel.add(partnersPanel);

        BattleStatePanel.initPanel();
        mainPanel.add(BattleStatePanel.battleStatePanel);
        add(mainPanel);
    }

    public void updateStats(){
        partnersPanel.updateCharacterPanel();
        rivalsPanel.updateCharacterPanel();
    }

}
