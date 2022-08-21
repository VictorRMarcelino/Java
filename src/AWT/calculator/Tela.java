package AWT.calculator;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static AWT.calculator.MiniPainel.*;
import static AWT.calculator.Painel.*;
import static AWT.calculator.SpecialButtons.*;
import static AWT.calculator.buttons.*;

public class Tela {
    static JFrame calculator = new JFrame();
    static int widthFrame, heightFrame;
    static String title = "Calculator";

    public static void main(String[] args) {
        setSizeJFrame();
        setTitleJFrame();
        setLocationJFrame();
        setLayoutJFrame();
        PainelInFrame();
        ButtonsInFrame();
        SpecialButtonInFrame();
        MiniPainelInFrame();
        calculator.setVisible(true);
    }

    public static void setSizeJFrame(){
        widthFrame = 370;
        heightFrame = 450;
        calculator.setSize(widthFrame, heightFrame);
        calculator.setResizable(false);
    }
    public static void setTitleJFrame(){
        title = "Calculadora";
        calculator.setTitle(title);
    }
    public static void setLocationJFrame(){
        calculator.setLocationRelativeTo(null);
    }
    public static void setLayoutJFrame(){
        calculator.setLayout(null);
    }
    public static void ButtonsInFrame(){
        calculator.add(button0);

        calculator.add(button1);
        calculator.add(button2);
        calculator.add(button3);

        calculator.add(button4);
        calculator.add(button5);
        calculator.add(button6);

        calculator.add(button7);
        calculator.add(button8);
        calculator.add(button9);

        setHeightAndWeight();
        setLocationButtons();
        setTextButtons();
        setEventListenerButtons();
    }
    public static void PainelInFrame(){
        calculator.add(Visor);
        setSizeVisor();
        setLocationVisor();
        Visor.setEditable(false);
    }
    public static void MiniPainelInFrame(){
        calculator.add(MiniVisor);
        setSizeMiniVisor();
        setLocationMiniVisor();
        MiniVisor.setEditable(false);
    }

    public static void SpecialButtonInFrame(){
        calculator.add(dot);
        calculator.add(equals);
        calculator.add(erase);
        calculator.add(backspace);
        calculator.add(sum);
        calculator.add(subtraction);
        calculator.add(multiplication);
        calculator.add(division);
        setHeightAndWeightSpecialButtons();
        setLocationSpecialButtons();
        setTextSpecialButtons();
        setEventListenerSpecialButtons();
    }
}
