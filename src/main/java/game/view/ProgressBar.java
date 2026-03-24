package game.view;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JPanel {
    private JPanel progress = new JPanel();
    private int maxValue;
    private int maxProgress = 50;
    private int currentProgress = maxProgress;


    public ProgressBar(int maxValue, Color colorBar) {
        this.maxValue =  maxValue;
        setBackground(Color.cyan);
        setBorder(Borders.classicBorder);
        setLayout(null);
        setPreferredSize(new Dimension(maxProgress, 10));
        progress.setBackground(colorBar);
        progress.setBounds(0, 0,maxProgress,10);
        add(progress);

    }

    public void decrease(int value){
        currentProgress -= calculatePercentage(value);
        if(currentProgress < 0) currentProgress = 0;
        progress.setBounds(0,0, currentProgress, 10);

    }

    public void increment(int value){
        currentProgress += calculatePercentage(value);
        if(currentProgress > maxProgress)currentProgress = maxProgress;
        progress.setBounds(0,0, currentProgress, 10);

    }

    private int calculatePercentage(int value){

        double percentageValue =  ((double) value / maxValue * 100);
        int pepe =  (int) ((int) maxProgress*percentageValue/100);
        System.out.println(value);
        System.out.println(percentageValue);
        System.out.println(pepe);
        return pepe;
    }
}
