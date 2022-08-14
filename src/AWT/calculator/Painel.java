package AWT.calculator;

import javax.swing.*;

public class Painel {
    static private int width, height, PosXPainel, PosYPainel;
    static public JTextField Visor = new JTextField();

    public static void setSizeVisor(){
        width = 360;
        height = 30;
        Visor.setSize(width, height);
    }
}
