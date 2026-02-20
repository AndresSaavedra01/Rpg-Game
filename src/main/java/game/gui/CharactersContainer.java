package game.gui;

import game.entities.Aspects;

import javax.swing.*;
import java.awt.*;

class CharactersContainer extends JPanel {
    public CharactersContainer() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(Color.PINK);
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        p.setBackground(Color.GREEN);
        p1.setBackground(Color.GRAY);


        add(new AspectCharacterPanel(Aspects.getImages().get(2)));
        add(new AspectCharacterPanel(Aspects.getImages().get(3)));
    }
}