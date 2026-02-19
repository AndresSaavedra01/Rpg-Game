package game.gui;

import game.entities.*;
import game.entities.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Window extends JFrame {


    public Window() {
        super("Rpgero");

        int width = 1080;
        int height = 720;

        Toolkit tools = Toolkit.getDefaultToolkit();
        Image icon = tools.getImage("src/images/icons8-pepe-the-frog-48.png");
        Dimension d = tools.getScreenSize();
        setIconImage(icon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(d.width / 2 - width / 2, d.height / 2 - height / 2, width, height);
        setLayout(new BorderLayout(10,10));
        add(new CharactersContainer(), BorderLayout.CENTER);
        add(new SkillPanel(), BorderLayout.SOUTH);

        List<Character> allies = createAllies();
        assert allies != null;
        allies.add(createPlayer());
        BattleContext battleContext = new BattleContext(allies,createEnemies());
        Battle battle = new Battle(battleContext);

        setVisible(true);

    }


    private Character createPlayer(){
        return null;
    }

    private List<Character> createAllies(){

        return null;
    }

    private List<Character> createEnemies(){
        return null;
    }

}

class SkillPanel extends JPanel{
    public SkillPanel(){
        setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
        setBackground(Color.BLUE);
        add(new SkillButton("otorinolaringologo"));
        add(new SkillButton("PEPE"));
        add(new SkillButton("PEPE"));
        add(new SkillButton("PEPE"));
    }
}

class CharactersContainer extends JPanel{
    public CharactersContainer() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setBackground(Color.PINK);
        JPanel p = new JPanel();
        JPanel p1 = new JPanel();
        p.setBackground(Color.GREEN);
        p1.setBackground(Color.GRAY);


        add(new AspectCharacterPanel(Aspects.getImages().get(2)));
        add(new AspectCharacterPanel(Aspects.getImages().get(3)));
    }
}

class AspectCharacterPanel extends JPanel{
    Image aspect;
    static boolean pepe = true;

    public AspectCharacterPanel(Image aspect) {
        this.aspect =  aspect;
        if (pepe)setBackground(Color.BLUE);
        if (!pepe)setBackground(Color.GRAY);
        pepe=!pepe;
        scaledImage();

    }

    private void scaledImage(){
        aspect = aspect.getScaledInstance(500,500,Image.SCALE_DEFAULT);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(aspect, this.getWidth()/2-(aspect.getWidth(this)/2),this.getHeight()/2-(aspect.getHeight(this)/2), this);
    }
}

class SkillButton extends JButton{
    public SkillButton(String text) {
        super(text);
        setBackground(Color.DARK_GRAY);
        setForeground(Color.WHITE);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}