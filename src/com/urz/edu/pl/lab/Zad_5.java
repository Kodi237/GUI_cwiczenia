package com.urz.edu.pl.lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zad_5 {
    private JComboBox comboBox;
    private JTextField insertField;
    private JButton dodajDoListyButton;
    private JButton wstawButton;
    private JButton usunWybranyButton;
    private JButton usunButton;
    private JButton wyczyscListeButton;
    private JTextField insertIndexField;
    private JTextField removeIndexField;
    private JLabel Label;
    private JPanel panelMain;

    public Zad_5(){

        dodajDoListyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                comboBox.addItem(insertField.getText());
            }
        });
        usunWybranyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                comboBox.removeItem(comboBox.getSelectedItem());
            }
        });
        wyczyscListeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                comboBox.removeAllItems();
            }
        });
        wstawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = Integer.parseInt(insertIndexField.getText());
                comboBox.insertItemAt(insertField.getText(),index);
            }
        });
        usunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = Integer.parseInt(removeIndexField.getText());
                comboBox.removeItemAt(index);
            }
        });
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                String label = String.valueOf(comboBox.getSelectedItem());
                Label.setText(label);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 5");
        frame.setContentPane(new Zad_5().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600,400);
    }
}
