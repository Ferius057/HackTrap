package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI1 extends JFrame {
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
    private JLabel strana = new JLabel("Введите Страну проживания:");
    private JLabel gorod = new JLabel("Введите Город проживания:");
    private JLabel adres = new JLabel("Введите Адрес проживания:");
    private JLabel numberphone = new JLabel("Введите Номер телефона:");
    private JLabel ip = new JLabel("Введите Ip:");
    private JRadioButton radio1 = new JRadioButton("- ");
    private JRadioButton radio2 = new JRadioButton( "- ");
    private JLabel pok = new JLabel(    "!!!ВЫБЕРАТЬ ТЕ ЖЕ ГАЛКИ ЧТО И НА 1 ОКНЕ!!!");
    private JCheckBox check = new JCheckBox("Имя", false);
    private JCheckBox check1 = new JCheckBox("Фамилия", false);
    private JCheckBox check2 = new JCheckBox("Возраст", false);
    private JCheckBox check3 = new JCheckBox("Страна проживания", false);
    private JCheckBox check4 = new JCheckBox("Город проживания", false);
    private JCheckBox check5 = new JCheckBox("Адрес проживания", false);
    private JCheckBox check6 = new JCheckBox("Номер телефона", false);
    private JCheckBox check7 = new JCheckBox("Ip", false);

    public SimpleGUI1 () {
        super("[ВВОДИТЬ СЮДА]");
        this.setBounds(800, 50, 400, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        ButtonGroup group = new ButtonGroup();
        container.setLayout(new GridLayout(26,3,3, 3));

        container.add(name);
        container.add(input2);
        container.add(nickname);
        container.add(input3);
        container.add(age);
        container.add(input4);
        container.add(strana);
        container.add(input5);
        container.add(gorod);
        container.add(input6);
        container.add(adres);
        container.add(input7);
        container.add(numberphone);
        container.add(input8);
        container.add(ip);
        container.add(input9);

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
            String message = "Все что было найдено в базе:\n";
            if (check.isSelected()) {
                message += "Имя:  " + ((check.isSelected()) ? " " + input2.getText() + "\n" : " Ты не вел текст.");
            }
            if(check1.isSelected()) {
                message += "Фамилия:   " + ((check1.isSelected()) ? " " + input3.getText() + "\n" : "\n");
            }
            if (check2.isSelected()) {
                message += "Возраст:   " + ((check2.isSelected()) ? " "  + input4.getText() + "\n": "\n");
            }
            if (check3.isSelected()) {
                message += "Страна проживания:  " + ((check3.isSelected()) ? " " + input5.getText() + "\n" : "\n");
            }
            if (check4.isSelected()) {
                message += "Город проживания:  " + ((check4.isSelected()) ? " " + input6.getText() + "\n" : "\n");
            }
            if (check5.isSelected()) {
                message += "Адрес проживания:   " + ((check5.isSelected()) ? " "  + input7.getText() + "\n": "\n");
            }
            if (check6.isSelected()) {
                message += "Номер телефона:   " + ((check6.isSelected()) ? " " + input8.getText() + "\n" : "\n");
            }
            if (check7.isSelected()) {
                message += "Ip:   " + ((check7.isSelected()) ? " " + input9.getText() + "\n" : "\n");
            }
            JOptionPane.showMessageDialog(null, message, "Ответ.", JOptionPane.PLAIN_MESSAGE);
        }
    }
}