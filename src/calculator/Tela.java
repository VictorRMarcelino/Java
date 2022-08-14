package calculator;

import javax.swing.*;

import java.awt.*;

import static calculator.buttons.*;

public class Tela {
    static JFrame calculator = new JFrame();
    static int widthFrame, heightFrame;
    static String title = "Calculator";

    public static void main(String[] args) {
        setSizeJFrame();
        setTitleJFrame();
        setLocationJFrame();
        setLayoutJFrame();
        addButtonsInFrame();
        calculator.setVisible(true);
    }

    public static void setSizeJFrame(){
        widthFrame = 400;
        heightFrame = 400;
        calculator.setSize(widthFrame, heightFrame);
    }
    public static void setTitleJFrame(){
        title = "Calculator";
        calculator.setTitle(title);
    }
    public static void setLocationJFrame(){
        calculator.setLocationRelativeTo(null);
    }
    public static void setLayoutJFrame(){
        calculator.setLayout(new FlowLayout());
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
}
