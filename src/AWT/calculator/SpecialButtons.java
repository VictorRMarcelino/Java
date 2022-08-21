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
    static JButton dot = new JButton();
    static JButton equals = new JButton();
    static JButton erase = new JButton();
    static JButton backspace = new JButton();

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
        dot.setSize(widthButton, heightButton);
        equals.setSize(widthButton, heightButton);
        erase.setSize(150, 30);
        backspace.setSize(150, 30);
    }
    public static void setLocationSpecialButtons(){
        dot.setLocation(100, 305);
        equals.setLocation(190, 305);
        sum.setLocation(280, 305);
        subtraction.setLocation(280, 225);
        multiplication.setLocation(280, 145);
        division.setLocation(280, 65);
        backspace.setLocation(10, 375);
        erase.setLocation(190, 375);
    }

    public static void setTextSpecialButtons(){
        sum.setText("+");
        subtraction.setText("-");
        multiplication.setText("*");
        division.setText("/");
        dot.setText(".");
        equals.setText("=");
        erase.setText("Limpar");
        backspace.setText("Apagar");
    }

    public static void setEventListenerSpecialButtons(){
        dot.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText(Visor.getText() + ".");
            }
        });
        erase.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visor.setText("");
                MiniVisor.setText("");
            }
        });
        backspace.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newVisor = Visor.getText();
                try {
                    newVisor = newVisor.substring(0, newVisor.length() - 1);
                    Visor.setText(newVisor);
                }catch (Exception error){
                    JOptionPane.showMessageDialog(null, error);
                }
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
                MiniVisor.setText(MiniVisor.getText() + textValue2);
                Visor.setText(textFinalValue);
            }
        });
    }

}
