package AWT.calculator;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static AWT.calculator.MiniPainel.*;
import static AWT.calculator.Painel.*;
import static AWT.calculator.SpecialButtons.*;
import static AWT.calculator.buttons.*;

public class Tela {
    static JFrame calculator = new JFrame();

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

    protected static void setSizeJFrame(){
        int widthFrame, heightFrame;
        widthFrame = 370;
        heightFrame = 450;
        calculator.setSize(widthFrame, heightFrame);
        calculator.setResizable(false);
    }
    protected static void setTitleJFrame(){
        String title;
        title = "Calculadora";
        calculator.setTitle(title);
    }
    protected static void setLocationJFrame(){
        calculator.setLocationRelativeTo(null);
    }
    protected static void setLayoutJFrame(){
        calculator.setLayout(null);
    }
    protected static void ButtonsInFrame(){
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
    protected static void PainelInFrame(){
        calculator.add(Visor);
        setSizeVisor();
        setLocationVisor();
        Visor.setEditable(false);
    }
    protected static void MiniPainelInFrame(){
        calculator.add(MiniVisor);
        setSizeMiniVisor();
        setLocationMiniVisor();
        MiniVisor.setEditable(false);
    }

    protected static void SpecialButtonInFrame(){
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
