package AWT.calculator;

import javax.swing.*;

public class buttons {
    static String text;
    static int heightButton, widthButton;
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
        widthButton = 30;
        heightButton = 30;
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
        button1.setLocation(10, 360);
        button2.setLocation(widthButton, heightButton);
        button3.setLocation(widthButton, heightButton);
        button4.setLocation(widthButton, heightButton);
        button5.setLocation(widthButton, heightButton);
        button6.setLocation(widthButton, heightButton);
        button7.setLocation(widthButton, heightButton);
        button8.setLocation(widthButton, heightButton);
        button9.setLocation(widthButton, heightButton);
    }
}
