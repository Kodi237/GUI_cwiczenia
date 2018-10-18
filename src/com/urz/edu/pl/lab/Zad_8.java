package com.urz.edu.pl.lab;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad_8 {
    private JButton button1Button;
    private JButton button2Button;
    private JButton button3Button;
    private JTabbedPane Panel3;
    private JTabbedPane Panel2;
    private JTabbedPane Panel1;
    private JCheckBox panel1CheckBox;
    private JCheckBox panel2CheckBox;
    private JCheckBox panel3CheckBox;
    private JTextField jTextField3;
    private JTextField jTextField2;
    private JTextField jTextField1;
    private JPanel panelMain;

    public Zad_8() {
        panel1CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(panel1CheckBox.isSelected()){
                    Panel1.setVisible(true);
                }else {
                    Panel1.setVisible(false);
                }
            }
        });
        panel2CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(panel2CheckBox.isSelected()){
                    Panel2.setVisible(true);
                }else {
                    Panel2 .setVisible(false);
                }
            }
        });
        panel3CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(panel3CheckBox.isSelected()){
                    Panel3.setVisible(true);
                }else {
                    Panel3.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 8");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Zad_8().panelMain);
        frame.pack();
        frame.setVisible(true);
        //frame.setSize(800,600);

    }
}
