package game.view;


import game.model.Character;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterPanelContainer extends JPanel {
    private final List<CharacterPanel> characterPanels = new ArrayList<>();
    private int index = -1;

    public CharacterPanelContainer(List<Character> characters) {
        setBackground(Color.DARK_GRAY);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 200));

        for (Character character: characters){
            characterPanels.add(new CharacterPanel(character));
        }
        add(characterPanels.getFirst());
        add(characterPanels.get(1));
        add(characterPanels.get(2));
        //setBorder(Borders.classicBorder);
    }

    public void moveIndexToRight(){
        if(index + 1 < characterPanels.size()){
            index++;
        }else {
            index = 0;
        }
        selectCharacterPanel(index);
    }

    public void moveIndexToLeft(){
        if(index- 1 >= 0 ){
            index--;
        }else {
            index = characterPanels.size() -1;
        }
        selectCharacterPanel(index);
    }

    public void resetIndex(){
        index = -1;
        deselectAll();
    }

    private void selectCharacterPanel(int index){
        deselectAll();
        characterPanels.get(index).changeToSelectionBorder();
    }

    private void deselectAll(){
        for (CharacterPanel c : characterPanels){
            c.changeToDefaultBorder();
        }
    }

    public List<CharacterPanel> getCharacterPanels() {
        return characterPanels;
    }

}