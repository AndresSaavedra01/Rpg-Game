package game.controller;


import game.model.Character;
import game.view.ButtonsPanel;
import game.view.CharacterPanelContainer;
import game.view.DisplayBattle;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Player extends CharacterController {

    public Player(CharactersManager manager) {
        super(manager);
    }


    @Override
    public void takeTurn(Character caster) {
        System.out.println("turno de aliado numero: " + manager.getAllies().indexOf(caster));
        super.takeTurn(caster);
    }

    @Override
    int chooseSkill() {
        AtomicInteger choose = new AtomicInteger(0);
        while (choose.get() == 0){
            ButtonsPanel.getAttack().addActionListener(e -> choose.set(1));
            ButtonsPanel.getGuard().addActionListener(e -> choose.set(2));
            ButtonsPanel.getHealing().addActionListener(e -> choose.set(3));
        }
        return choose.get();
    }

    @Override
    Character chooseMyFella(Character caster) {
        return manager.getAllies().get(getSelect(DisplayBattle.getAlliesContainer()));
    }

    @Override
    Character chooseRival(Character caster) {
        return manager.getEnemies().get(getSelect(DisplayBattle.getEnemiesContainer()));
    }


    private int getSelect(CharacterPanelContainer characterPanelContainer){
        Optional<Integer> index =  Optional.empty();
        InputController.setContainerFocus(characterPanelContainer);

        while (index.isEmpty()){
            System.out.println("select...");
            index = InputController.getCurrentIndex();
        }

        InputController.resetContainerFocus();
        return index.get();
    }

}
