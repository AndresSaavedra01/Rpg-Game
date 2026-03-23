package resources;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Images {
    static final public File fileClerics =  new File("src/images/Tiny Cleric.png");
    static final public File fileWarrior =  new File("src/images/Tiny Warrior.png");
    static final public File fileRogue =  new File("src/images/Tiny Rogue.png");
    static final public File fileWizard =  new File("src/images/Tiny Wizard.png");
    static final public File fileRange =  new File("src/images/Tiny Ranger.png");

    public static Image cut(File url , boolean isEnemy){
        BufferedImage image;
        try{
            image = ImageIO.read(url);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if(isEnemy) return image.getSubimage(0, 112, 16, 16) ;
        else return image.getSubimage(0, 32, 16, 16) ;
    }

}
