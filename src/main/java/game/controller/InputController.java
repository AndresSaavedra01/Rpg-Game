package game.controller;

import java.awt.event.*;

public class InputController implements KeyListener, MouseWheelListener {


    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println(e.getWheelRotation());
        System.out.println(e.getScrollAmount());
    }
}
