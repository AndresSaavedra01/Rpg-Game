package game.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Borders {
    static Border classicBorder = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.darkGray),
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

    static Border selectionBorder =  BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.RED, 5, true),
            BorderFactory.createEmptyBorder(10,10,10,10)
    );
}
