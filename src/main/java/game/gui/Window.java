package game.gui;

import game.entities.*;
import game.entities.Character;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Window extends JFrame {

    static List<Character> allies = createAllies();
    static Character player;
    static BattleContext battleContext = new BattleContext(allies,createEnemies());
    static Battle battle = new Battle(battleContext);
    static JPanel mainPanel = new JPanel();

    public Window() {
        super("Rpgero");

        int width = 1080;
        int height = 720;

        Toolkit tools = Toolkit.getDefaultToolkit();
        Image icon = tools.getImage("src/images/icons8-pepe-the-frog-48.png");
        Dimension d = tools.getScreenSize();
        setIconImage(icon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(d.width / 2 - width / 2, d.height / 2 - height / 2, width, height);
        add(mainPanel);
        showSelector();
        setVisible(true);
       // battle.loopBattle();

    }

    public static void showSelector(){
        mainPanel.removeAll();
        mainPanel.add(new SelectorClassPlayer());
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public static void showBattle(){
        mainPanel.removeAll();
        mainPanel.add(new BattlePanel());
        mainPanel.revalidate();
        mainPanel.repaint();
    }


    static private List<Character> createAllies(){

        return null;
    }

    static private List<Character> createEnemies(){
        return null;
    }

}