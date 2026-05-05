package game.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;


public class ManagerImage {

   public static Image allyImage =  loadImage();

    public static Image loadImage(){
        Image i;
        try{
            File f = new File("src/images/characterImages/Tiny Cleric.png");
            BufferedImage bi = ImageIO.read(f);
            i =  bi.getSubimage(0, 32, 16, 16);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return i;
    }


}
