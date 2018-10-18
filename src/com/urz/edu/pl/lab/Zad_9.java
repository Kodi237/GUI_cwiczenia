package com.urz.edu.pl.lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zad_9 {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1Button;
    private JButton button2Button;
    private JButton button3Button;
    private JRadioButton panel1RadioButton;
    private JRadioButton panel2RadioButton;
    private JRadioButton panel3RadioButton;
    private JTabbedPane Panel1;
    private JTabbedPane Panel2;
    private JTabbedPane Panel3;
    private JPanel panelMain;

    public Zad_9() {
        panel1RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(panel1RadioButton.isSelected()){
                    Panel1.setVisible(true);
                }else{
                    Panel1.setVisible(false);
                }
            }
        });
        panel2RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(panel2RadioButton.isSelected()){
                    Panel2.setVisible(true);
                }else{
                    Panel2.setVisible(false);
                }
            }
        });
        panel3RadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(panel3RadioButton.isSelected()){
                    Panel3.setVisible(true);
                }else{
                    Panel3.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Zad_9().panelMain);
        frame.pack();
        frame.setVisible(true);
    }
}
