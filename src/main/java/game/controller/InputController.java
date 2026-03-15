package game.controller;

import java.awt.event.*;
import java.util.Optional;

import game.view.CharacterPanelContainer;
import game.view.DisplayBattle;

public class InputController implements KeyListener, MouseWheelListener {

    private Optional<CharacterPanelContainer> containerFocus = Optional.empty();
    private boolean change = false;

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

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


    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e.getWheelRotation());
        System.out.println(e.getScrollAmount());
    }


    public Optional<CharacterPanelContainer> getContainerFocus() {
        return containerFocus;
    }

    private void setContainerFocus(Optional<CharacterPanelContainer> containerFocus) {
        this.containerFocus = containerFocus;
    }
}
