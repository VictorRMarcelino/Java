package AWT.calculator;

import javax.swing.*;

public class Painel {
    static private int width, height, PosXPainel, PosYPainel;
    static public JTextField Visor = new JTextField();

    public static void setSizeVisor(){
        width = 330;
        height = 30;
        Visor.setSize(width, height);
    }

    public static void setLocationVisor(){
        PosXPainel = 10;
        PosYPainel = 25;
        Visor.setLocation(PosXPainel, PosYPainel);
    }
}
