package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Продолжить");
    private JTextField input1 = new JTextField("", 5);
    private JTextField input2 = new JTextField("", 5);
    private JTextField input3 = new JTextField("", 5);
    private JTextField input4 = new JTextField("", 5);
    private JTextField input5 = new JTextField("", 5);
    private JTextField input6 = new JTextField("", 5);
    private JTextField input7 = new JTextField("", 5);
    private JTextField input8 = new JTextField("", 5);
    private JTextField input9 = new JTextField("", 5);
    private JLabel gender = new JLabel("Введите ссылку на жертву:\n");
    private JLabel name = new JLabel("Введите Имя:\n");
    private JLabel nickname = new JLabel("Введите Фамилию:\n");
    private JLabel age = new JLabel("Введите Возраст:");
    private JRadioButton radio1 = new JRadioButton("- ");
    private JRadioButton radio2 = new JRadioButton( "- ");
    private JLabel pok = new JLabel("Выберите что показать :\n");
    private JCheckBox check = new JCheckBox("Имя", false);
    private JCheckBox check1 = new JCheckBox("Фамилия", false);
    private JCheckBox check2 = new JCheckBox("Возраст", false);
    private JCheckBox check3 = new JCheckBox("Страна проживания", false);
    private JCheckBox check4 = new JCheckBox("Город проживания", false);
    private JCheckBox check5 = new JCheckBox("Адрес проживания", false);
    private JCheckBox check6 = new JCheckBox("Номер телефона", false);
    private JCheckBox check7 = new JCheckBox("Ip", false);

    public SimpleGUI () {
        super("Взлом жопы.");
        this.setBounds(50, 50, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        container.setLayout(new GridLayout(12 , 3, 3, 3));

        container.add(gender);
        container.add(input1);
        container.add(pok);
        container.add(check);
        container.add(check1);
        container.add(check2);
        container.add(check3);
        container.add(check4);
        container.add(check5);
        container.add(check6);
        container.add(check7);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "\'Все что было найдено в базе:\'\n";
            message += "Имя:  " + ((check.isSelected()) ? " " + input2.getText() + "\n" : "\n");
            message += "Фамилия:   " + ((check1.isSelected()) ? " " + input3.getText() + "\n" : "\n");
            message += "Возраст:   " + ((check2.isSelected()) ? " "  + input4.getText() + "\n": "\n");
            JOptionPane.showMessageDialog(null, message, "Ответ.", JOptionPane.PLAIN_MESSAGE);
        }
    }
}