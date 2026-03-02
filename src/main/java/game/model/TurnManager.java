package game.model;


import java.util.Comparator;
import java.util.List;



public class TurnManager {

    List<Character> queue;
    private int CurrentIndex = 0;

    public TurnManager(List<Character> queue) {
        this.queue = queue;
        sortBySpeed();
    }

    private void sortBySpeed(){
        queue.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Integer.compare(o1.getSpeed(),o2.getSpeed());
            }
        });
    }

    public Character getNext(){
        CurrentIndex++;
        if(CurrentIndex > queue.size())CurrentIndex = 1;
        return queue.get(CurrentIndex-1);
    }

}
