package game.entities;


import java.util.*;

public class TurnManager {
    private Queue<Character> turnQueue =  new ArrayDeque<>();


    public void buildQueue(List<Character> allies, List<Character> enemies){
        List<Character> aux =  new ArrayList<>(allies);
        aux.addAll(enemies);

        Arrays.sort(turnQueue.toArray());

//        while (!aux.isEmpty()){
//            Character maxSpeedCharacter = aux.getFirst();
//            for(Character character: aux){
//                if(maxSpeedCharacter.getStats().getSpeed().getValue() < character.getStats().getSpeed().getValue()){
//                    maxSpeedCharacter =  character;
//                }
//            }
//            aux.remove(maxSpeedCharacter);
//            turnQueue.add(maxSpeedCharacter);
//        }
    }

    public Character queuePoll(){
        return turnQueue.poll();
    }

    public boolean queueIsEmpty() {
        return turnQueue.isEmpty();
    }
}
