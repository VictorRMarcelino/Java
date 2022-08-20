package AWT.calculator;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static AWT.calculator.Painel.Visor;

public class buttons {
    static String text;
    static int heightButton, widthButton;
    static JButton button0 = new JButton();
    static JButton button1 = new JButton();
    static JButton button2 = new JButton();
    static JButton button3 = new JButton();
    static JButton button4 = new JButton();
    static JButton button5 = new JButton();
    static JButton button6 = new JButton();
    static JButton button7 = new JButton();
    static JButton button8 = new JButton();
    static JButton button9 = new JButton();


    public static void setHeightAndWeight(){
        widthButton = 60;
        heightButton = 60;
        button0.setSize(widthButton, heightButton);
        button1.setSize(widthButton, heightButton);
        button2.setSize(widthButton, heightButton);
        button3.setSize(widthButton, heightButton);
        button4.setSize(widthButton, heightButton);
        button5.setSize(widthButton, heightButton);
        button6.setSize(widthButton, heightButton);
        button7.setSize(widthButton, heightButton);
        button8.setSize(widthButton, heightButton);
        button9.setSize(widthButton, heightButton);
    }
    public static void setLocationButtons(){
        button0.setLocation(10, 305);

        button1.setLocation(10, 225);
        button2.setLocation(100, 225);
        button3.setLocation(190, 225);

        button4.setLocation(10, 145);
        button5.setLocation(100, 145);
        button6.setLocation(190, 145);

        button7.setLocation(10, 65);
        button8.setLocation(100, 65);
        button9.setLocation(190, 65);
    }

    public static void setTextButtons(){
        button0.setText("0");
        button1.setText("1");
        button2.setText("2");
        button3.setText("3");
        button4.setText("4");
        button5.setText("5");
        button6.setText("6");
        button7.setText("7");
        button8.setText("8");
        button9.setText("9");
    }

    public static void setEventListenerButtons(){
        button0.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "0");
            }
        });
        button1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "1");
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "2");
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "3");
            }
        });
        button4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "4");
            }
        });
        button5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "5");
            }
        });
        button6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "6");
            }
        });
        button7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "7");
            }
        });
        button8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "8");
            }
        });
        button9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + "9");
            }
        });
    }
}
