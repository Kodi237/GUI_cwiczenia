package com.urz.edu.pl.lab;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


public class Zad_6 extends JFrame {
    private JSlider jSliderRed;
    private JSlider jSliderGreen;
    private JSlider jSliderBlue;
    private JPanel panelMain;
    private JLabel labelBlue;
    private JLabel labelGreen;
    private JLabel labelRed;

    public Zad_6(){
        jSliderRed.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                labelRed.setText(String.valueOf(jSliderRed.getValue()));
                panelMain.setBackground(new Color(jSliderRed.getValue(),jSliderGreen.getValue(), jSliderBlue.getValue()));
            }
        });
        jSliderGreen.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                labelGreen.setText(String.valueOf(jSliderGreen.getValue()));
                panelMain.setBackground(new Color(jSliderRed.getValue(),jSliderGreen.getValue(), jSliderBlue.getValue()));
            }
        });
        jSliderBlue.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                labelBlue.setText(String.valueOf(jSliderBlue.getValue()));
                panelMain.setBackground(new Color(jSliderRed.getValue(),jSliderGreen.getValue(), jSliderBlue.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Zad_6().panelMain);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(800,600);

    }
}
