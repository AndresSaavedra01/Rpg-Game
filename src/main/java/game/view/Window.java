package game.view;


import game.model.entities.Character;
import game.model.entities.Side;
import game.model.entities.Stats;
import game.model.logic.Battle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Window extends JFrame {

    ButtonsPanel buttonsPanel =  new ButtonsPanel();
    BattlePanel battlePanel =  new BattlePanel();
    Battle battle = new Battle(init());

    public Window() {

        setSize(1080, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new BorderLayout());

        add(buttonsPanel, BorderLayout.SOUTH);
        add(battlePanel,BorderLayout.CENTER);
        buttonsPanel.getAttack().addActionListener(e -> {
           battle.playerTurn(1,selectTarget());
        });
        buttonsPanel.getGuard().addActionListener(e -> {
            battle.playerTurn(2, 0);
        });
        buttonsPanel.getHealing().addActionListener(e -> {
            battle.playerTurn(3,selectTarget());
        });
        battle.nextTurn();
    }

    private int selectTarget() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa un numero entre el 0 y el 2"));
    }

    public List<Character> init(){
        List<Character> cs =  new ArrayList<>();
        Character c =  new Character("pepe", Side.ALLY, new Stats(12, 5, 7, 2, 4));
        cs.add(c);
        c =  new Character("pepito", Side.ALLY, new Stats(12, 5, 7, 2, 4));
        cs.add(c);
        c =  new Character("peponsio", Side.ALLY, new Stats(12, 5, 7, 2, 4));
        cs.add(c);
        c =  new Character("turbi", Side.ENEMY, new Stats(12, 5, 7, 2, 4));
        cs.add(c);
        c =  new Character("turbilero", Side.ENEMY, new Stats(12, 5, 7, 2, 4));
        cs.add(c);
        c =  new Character("turbina", Side.ENEMY, new Stats(12, 5, 7, 2, 4));
        cs.add(c);

        return cs;
    }

}
