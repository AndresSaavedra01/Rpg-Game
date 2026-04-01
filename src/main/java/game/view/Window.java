package game.view;

import game.controller.BattleController;
import game.controller.InputController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame {
    Toolkit t =  Toolkit.getDefaultToolkit();
    JPanel windowPanel = new JPanel();
    static final int width =  1080;
    static final int height = 720;
    static BattleController battleController = new BattleController();

    public Window() {
        super("RPGero");

        Dimension dimension = t.getScreenSize();
        int widthPosition = dimension.width / 2 -  width / 2 ;
        int heightPosition = dimension.height / 2 -  height / 2 ;

        setBounds(widthPosition, heightPosition, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        InputController i = new InputController();
        CardLayout cardLayout =  new CardLayout();
        StartPanel startPanel = new StartPanel(windowPanel, cardLayout);
        BattlePanel battlePanel = new BattlePanel();


        addKeyListener(i);
        windowPanel.setLayout(cardLayout);
        windowPanel.add(startPanel, "start");
        windowPanel.add(battlePanel, "battle");

        cardLayout.show(windowPanel, "start");
        add(new BattlePanel());
        setVisible(true);
        battleController.getBattle().startBattle();
    }

}
