package game.controller;

import java.awt.event.*;
import java.util.Optional;

import game.view.CharacterPanelContainer;
import game.view.DisplayBattle;

public class InputController extends KeyAdapter {

    private Optional<CharacterPanelContainer> containerFocus = Optional.empty();
    private boolean change = false;


    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);

        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            if (containerFocus.isPresent())containerFocus.get().resetIndex();

            if(change) containerFocus = Optional.of(DisplayBattle.getAlliesContainer());
            else containerFocus = Optional.of(DisplayBattle.getEnemiesContainer());
            change = !change;
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(containerFocus.isPresent()) containerFocus.get().moveIndexToRight();
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
           if(containerFocus.isPresent()) containerFocus.get().moveIndexToLeft();
        }
    }


}
