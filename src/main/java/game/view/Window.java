package game.view;

import game.controller.InputController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame {
    Toolkit t =  Toolkit.getDefaultToolkit();
    static final int width =  1080;
    static final int height = 720;

    public Window() {
        super("RPGero");

        Dimension dimension = t.getScreenSize();
        int widthPosition = dimension.width / 2 -  width / 2 ;
        int heightPosition = dimension.height / 2 -  height / 2 ;

        CardLayout cardLayout =  new CardLayout();
        setLayout(cardLayout);
        setBounds(widthPosition, heightPosition, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        InputController i = new InputController();
        addKeyListener(i);
        add(new BattlePanel());

        setVisible(true);


    }

}
