package AWT.calculator;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static AWT.calculator.MiniPainel.MiniVisor;
import static AWT.calculator.Painel.Visor;

public class SpecialButtons {

    static JButton sum = new JButton();
    static JButton subtraction = new JButton();
    static JButton multiplication = new JButton();
    static JButton division = new JButton();
    static JButton comma = new JButton();
    static JButton equals = new JButton();
    static JButton erase = new JButton();
    static JButton backspace = new JButton();
    static JButton history = new JButton();

    public static String textValue1, textValue2, textFinalValue;
    public static double value1, value2, finalValue;
    public static int operation;

    public static int widthButton, heightButton;


    public static void setHeightAndWeightSpecialButtons(){
        widthButton = 60;
        heightButton = 60;
        sum.setSize(widthButton, heightButton);
        subtraction.setSize(widthButton, heightButton);
        multiplication.setSize(widthButton, heightButton);
        division.setSize(widthButton, heightButton);
        comma.setSize(widthButton, heightButton);
        equals.setSize(widthButton, heightButton);
        erase.setSize(widthButton, 30);
        history.setSize(100, 30);
    }
    public static void setLocationSpecialButtons(){
        comma.setLocation(100, 305);
        equals.setLocation(190, 305);
        sum.setLocation(280, 305);
        subtraction.setLocation(280, 225);
        multiplication.setLocation(280, 145);
        division.setLocation(280, 65);
        erase.setLocation(280, 375);
        history.setLocation(10, 375);
    }

    public static void setTextSpecialButtons(){
        sum.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");
        comma.setText(",");
        equals.setText("=");
        erase.setText("Limpar");
        history.setText("History");
    }

    public static void setEventListenerSpecialButtons(){
        comma.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + ",");
            }
        });
        erase.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText("");
            }
        });
        sum.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textValue1 = Visor.getText();
                MiniVisor.setText(textValue1 + " + ");
                Visor.setText("");
                operation = 1;
            }
        });
        subtraction.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textValue1 = Visor.getText();
                MiniVisor.setText(textValue1 + " - ");
                Visor.setText("");
                operation = 2;
            }
        });
        multiplication.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textValue1 = Visor.getText();
                MiniVisor.setText(textValue1 + " * ");
                Visor.setText("");
                operation = 3;
            }
        });
        division.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textValue1 = Visor.getText();
                MiniVisor.setText(textValue1 + " / ");
                Visor.setText("");
                operation = 4;
            }
        });

        equals.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textValue2 = Visor.getText();
                value1 = Double.parseDouble(textValue1);
                value2 = Double.parseDouble(textValue2);
                switch (operation){
                    case 1 ->{
                        finalValue = value1 + value2;
                    }
                    case 2 ->{
                        finalValue = value1 - value2;
                    }
                    case 3 ->{
                        finalValue = value1 * value2;
                    }
                    case 4 ->{
                        finalValue = value1 / value2;
                    }
                }
                textFinalValue = String.valueOf(finalValue);
                MiniVisor.setText("");
                Visor.setText(textFinalValue);
            }
        });
    }

}
