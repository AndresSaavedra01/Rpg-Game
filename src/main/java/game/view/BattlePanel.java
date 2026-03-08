package game.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BattlePanel extends JPanel {

    public BattlePanel() {
        setLayout(new BorderLayout());
        add( new ButtonsPanel(), BorderLayout.SOUTH);
        add( new DisplayBattle(), BorderLayout.CENTER);
    }
}

class ButtonsPanel extends JPanel{
    private JButton attack =  new JButton("Attack");
    private JButton guard = new JButton("Guard");
    private JButton healing =  new JButton("Heling");

    ButtonsPanel(){
        setPreferredSize(new Dimension(Window.width, 100));
        add(attack);
        add(guard);
        add(healing);
        setBorder(Borders.classicBorder);
    }
}

class DisplayBattle extends JPanel{

    public DisplayBattle() {
        //setBackground(Color.ORANGE);
        setPreferredSize(new Dimension(200, 200));
        setBorder(Borders.classicBorder);
        add(new CharacterPanelContainer());
        add(new CharacterPanelContainer());
    }
}

class CharacterPanelContainer extends JPanel{

    public CharacterPanelContainer() {
        //setBackground(Color.PINK);
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        add(new CharacterPanel());
        add(new CharacterPanel());
        add(new CharacterPanel());
        //setBorder(Borders.classicBorder);
    }
}

class CharacterPanel extends JPanel{

    public CharacterPanel() {
        setBackground(Color.magenta);
        setPreferredSize(new Dimension(200, 200));
        setBorder(Borders.classicBorder);
    }
}


class Borders {
    static Border classicBorder = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.darkGray),
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

}