package AWT.calculator;

import javax.swing.*;

public class Painel {
    static private int width, height, PosXPainel, PosYPainel;
    static protected JTextField Visor = new JTextField();

    protected static void setSizeVisor(){
        width = 330;
        height = 30;
        Visor.setSize(width, height);
    }

    protected static void setLocationVisor(){
        PosXPainel = 10;
        PosYPainel = 25;
        Visor.setLocation(PosXPainel, PosYPainel);
    }
}
