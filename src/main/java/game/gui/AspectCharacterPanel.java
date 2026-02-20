package game.gui;

import javax.swing.*;
import java.awt.*;

class AspectCharacterPanel extends JPanel {
    Image aspect;
    static boolean pepe = true;

    public AspectCharacterPanel(Image aspect) {
        this.aspect =  aspect;
        if (pepe)setBackground(Color.BLUE);
        if (!pepe)setBackground(Color.GRAY);
        pepe=!pepe;
        scaledImage();

    }

    private void scaledImage(){
        aspect = aspect.getScaledInstance(500,500,Image.SCALE_DEFAULT);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(aspect, this.getWidth()/2-(aspect.getWidth(this)/2),this.getHeight()/2-(aspect.getHeight(this)/2), this);
    }
}
