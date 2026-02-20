package game.gui;

import game.entities.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SkillButton extends JButton {
    private static int cont = 0;
    int indexSkill;

    public SkillButton(String text) {
        super(text);
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        indexSkill = cont;
        cont++;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Window.battle.playerOnTur()){
                    Player player = (Player) Window.battle.getCtx().getPlayer();
                    player.setChooseSkill(player.getSkills().get(indexSkill));
                }
                System.out.println("pepepe");
            }
        });
    }

}