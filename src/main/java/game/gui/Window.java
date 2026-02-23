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
    static CardLayout cardLayout =  new CardLayout();
    static JPanel mainPanel = new JPanel(cardLayout);

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

        mainPanel.add(new SelectorClassPlayer(), "SELECTOR");
        mainPanel.add(new BattlePanel(), "BATTLE");

        add(mainPanel);
        setVisible(true);
       // battle.loopBattle();

    }

    public static void showSelector() {
        cardLayout.show(mainPanel, "SELECTOR");
    }

    public static void showBattle() {
        cardLayout.show(mainPanel, "BATTLE");
        System.out.println(player.getName());
    }


    static private List<Character> createAllies(){

        return null;
    }

    static private List<Character> createEnemies(){
        return null;
    }

}