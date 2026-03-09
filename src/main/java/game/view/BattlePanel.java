package game.view;



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class BattlePanel extends JPanel {

    public BattlePanel() {
        setLayout(new BorderLayout());
        add( new ButtonsPanel(), BorderLayout.SOUTH);
        add( new DisplayBattle(), BorderLayout.CENTER);
    }



}

class ButtonsPanel extends JPanel{
    private JButton attack =  new JButton("Attack");
    private JButton guard = new JButton("Guard");
    private JButton healing =  new JButton("Heling");

    ButtonsPanel(){
        setPreferredSize(new Dimension(Window.width, 100));
        add(attack);
        add(guard);
        add(healing);
        setBorder(Borders.classicBorder);
    }

    public JButton getAttack() {
        return attack;
    }

    public JButton getGuard() {
        return guard;
    }

    public JButton getHealing() {
        return healing;
    }
}

class DisplayBattle extends JPanel{

    private CharacterPanelContainer enemiesContainer =  new CharacterPanelContainer();
    private CharacterPanelContainer alliesContainer =  new CharacterPanelContainer();

    public DisplayBattle() {
        setBackground(Color.ORANGE);
        setBorder(Borders.classicBorder);

        setLayout(new GridLayout(1,2,10,10));
        add(alliesContainer);
        add(enemiesContainer);
        alliesContainer.capturedInput();
    }

    public CharacterPanelContainer getEnemiesContainer() {
        return enemiesContainer;
    }

    public CharacterPanelContainer getAlliesContainer() {
        return alliesContainer;
    }
}

class CharacterPanelContainer extends JPanel{
    private List<CharacterPanel> characterPanels = new ArrayList<>();
    private int index = 0;
    private boolean inFocus;

    public CharacterPanelContainer() {
        setBackground(Color.PINK);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 200));
        characterPanels.add(new CharacterPanel());
        characterPanels.add(new CharacterPanel());
        characterPanels.add(new CharacterPanel());
        characterPanels.add(new CharacterPanel());
        add(characterPanels.getFirst());
        add(characterPanels.get(1));
        add(characterPanels.get(2));
        setBorder(Borders.classicBorder);
    }

    public void capturedInput() {
        InputMap im = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        im.put(KeyStroke.getKeyStroke("RIGHT"), "moveRight");
        im.put(KeyStroke.getKeyStroke("LEFT"), "moveLeft");
        ActionMap am = getActionMap();


        am.put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveIndexToRight();
            }
        });


        am.put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveIndexToLeft();
            }
        });
    }

    private void moveIndexToRight(){
        if(index + 1 < characterPanels.size() - 1){
            index++;
        }else {
            index = 0;
        }
        selectCharacterPanel(index);
    }

    private void moveIndexToLeft(){
        if(index- 1 >= 0 ){
            index--;
        }else {
            index = characterPanels.size() -1;
        }
        selectCharacterPanel(index);
    }

    private void selectCharacterPanel(int index){
        deselectAll();
        System.out.println(index);
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

    public boolean isInFocus() {
        return inFocus;
    }

    public void setInFocus(boolean inFocus) {
        this.inFocus = inFocus;
    }
}

class CharacterPanel extends JPanel{


    public CharacterPanel() {
        setBackground(Color.magenta);
        setPreferredSize(new Dimension(150, 150));
        setBorder(Borders.classicBorder);
    }

    public void changeToSelectionBorder(){
        setBorder(Borders.selectionBorder);
    }

    public void changeToDefaultBorder(){
        setBorder(Borders.classicBorder);
    }

}


class Borders {
    static Border classicBorder = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.darkGray),
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

    static Border selectionBorder =  BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.RED, 5, true),
            BorderFactory.createEmptyBorder(10,10,10,10)
    );
}