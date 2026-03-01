import game.entities.Character;

import java.util.*;

public class Main {


    public static void main() {
        List<Numerito> numeritos =  new ArrayList<>();
        numeritos.add(new Numerito("puta", 1));
        numeritos.add(new Numerito("puta", 5));
        numeritos.add(new Numerito("puta", 300));
        numeritos.add(new Numerito("puta", -89));
        numeritos.add(new Numerito("puta", 45));

        numeritos.sort(Comparator.comparingInt(Numerito::getNumber));

        for (Numerito numerito: numeritos){
            System.out.println(numerito.getNumber());
        }

    }



}

class Numerito{
    String pepe;
    int number;

    public Numerito(String pepe, int number) {
        this.pepe = pepe;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}