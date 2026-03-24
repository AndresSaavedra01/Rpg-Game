package game.view;

import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JPanel {
    private JPanel progress = new JPanel();
    private JPanel mainPanel = new JPanel();
    private int maxValue;
    private int maxProgress = 50;
    private int currentProgress = maxProgress;


    public ProgressBar(int maxValue, Color colorBar) {
        this.maxValue =  maxValue;
        mainPanel.setBackground(Color.cyan);
        mainPanel.setBorder(Borders.classicBorder);
        mainPanel.setLayout(null);
        mainPanel.setPreferredSize(new Dimension(maxProgress, 10));
        progress.setBackground(colorBar);
        progress.setBounds(0, 0,maxProgress,10);
        mainPanel.add(progress);
        add(mainPanel);
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
        return (int) ((int) maxProgress*percentageValue/100);
    }
}
