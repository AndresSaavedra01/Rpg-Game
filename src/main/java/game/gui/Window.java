package game.gui;

import game.entities.*;
import game.entities.Character;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Window extends JFrame {

    static List<Character> allies = createAllies();
    static BattleContext battleContext = new BattleContext(allies,createEnemies());
    static Battle battle = new Battle(battleContext);

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
        setLayout(new BorderLayout(10,10));
        add(new CharactersContainer(), BorderLayout.CENTER);
        add(new SkillPanel(), BorderLayout.SOUTH);

        setVisible(true);
        battle.loopBattle();

    }


   static private Character createPlayer(){
        return null;
    }

    static private List<Character> createAllies(){
        Character player = createPlayer();

        return null;
    }

    static private List<Character> createEnemies(){
        return null;
    }

}