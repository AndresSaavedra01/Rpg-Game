package game.controller;

import java.awt.event.*;
import java.util.Optional;

import game.view.CharacterPanelContainer;
import game.view.DisplayBattle;

public class InputController extends KeyAdapter{

    private static Optional<CharacterPanelContainer> containerFocus = Optional.empty();
    private static Optional<Integer> currentIndex =  Optional.empty();

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);
        System.out.println(containerFocus.isPresent());
        if(containerFocus.isPresent()){
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                 containerFocus.get().moveIndexToRight();
            }

            if(e.getKeyCode() == KeyEvent.VK_LEFT){
               containerFocus.get().moveIndexToLeft();
            }
            if(e.getKeyCode() == KeyEvent.VK_SPACE){
                currentIndex = Optional.of(containerFocus.get().getIndex());
            }
        }

    }

    public static void setContainerFocus(CharacterPanelContainer containerFocus) {
        InputController.containerFocus =  Optional.of(containerFocus);
    }
    public static void resetContainerFocus(){
        InputController.containerFocus.ifPresent(CharacterPanelContainer::resetIndex);
        InputController.currentIndex = Optional.empty();
        InputController.containerFocus = Optional.empty();
    }

    public static Optional<Integer> getCurrentIndex() {
        return currentIndex;
    }
}
