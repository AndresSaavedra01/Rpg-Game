package game.entities;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Aspects {

   private static List<Image> images;

    private static List<Image> buildList(){
        Toolkit t = Toolkit.getDefaultToolkit();
        List<Image> imagenes =  new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            imagenes.add(t.getImage("src/images/Free Pack #3/Static_Free/"+i+".png"));
        }

        return imagenes;
    }

    public static List<Image> getImages() {
        return buildList();
    }
}
