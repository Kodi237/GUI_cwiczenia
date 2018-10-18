package com.urz.edu.pl.lab;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;

public class MojaFormatka {
    private JButton AddToListButton;
    private JTextField TextInput;
    private JPanel panelMain;
    private JList List;
    private JButton ClearListButton;
    private JButton InsertIntoListButton;
    private JButton Remove;
    private JLabel Label;
    private JTextField indexInput;
    private JButton RemoveButton;
    private JTextField indexRemove;
    private DefaultListModel lista;

    public MojaFormatka() {
        lista = new DefaultListModel<String>();
        List.setModel(lista);

        AddToListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lista.addElement(TextInput.getText());
            }
        });
        ClearListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                lista.removeAllElements();
            }
        });
        List.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                String label = String.valueOf(List.getSelectedValue());
                Label.setText(label);
            }
        });

        Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int selectedIndex = List.getSelectedIndex();
                lista.remove(selectedIndex);
            }
        });
        InsertIntoListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = Integer.parseInt(indexInput.getText());
                lista.add(index, TextInput.getText());
                List.setModel(lista);
            }
        });
        RemoveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int index = Integer.parseInt(indexRemove.getText());
                lista.removeElementAt(index);
                ;
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("MojaFormatka");
        frame.setContentPane(new MojaFormatka().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 400);

    }
}
