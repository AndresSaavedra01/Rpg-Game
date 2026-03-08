package game.view;

import javax.swing.*;
import java.awt.*;

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

        add(new BattlePanel());

        setVisible(true);

    }
}
