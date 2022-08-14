package AWT.calculator;

import javax.swing.*;

import static AWT.calculator.Painel.*;
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
        setConfigVisor();
        addPainelInFrame();
        //setConfigButtons();
        //addButtonsInFrame();
        calculator.setVisible(true);
    }

    public static void setSizeJFrame(){
        widthFrame = 400;
        heightFrame = 400;
        calculator.setSize(widthFrame, heightFrame);
        calculator.setResizable(false);
    }
    public static void setTitleJFrame(){
        title = "Calculator";
        calculator.setTitle(title);
    }
    public static void setLocationJFrame(){
        calculator.setLocationRelativeTo(null);
    }
    public static void setLayoutJFrame(){
        calculator.setLayout(null);
    }
    public static void setConfigButtons(){
        setHeightAndWeight();
        setLocationButtons();
    }
    public static void addButtonsInFrame(){
        calculator.add(button1);
        calculator.add(button2);
        calculator.add(button3);
        calculator.add(button4);
        calculator.add(button5);
        calculator.add(button6);
        calculator.add(button7);
        calculator.add(button8);
        calculator.add(button9);
    }
    public static void setConfigVisor(){
        setSizeVisor();
    }
    public static void addPainelInFrame(){
        calculator.add(Visor);
    }
}
