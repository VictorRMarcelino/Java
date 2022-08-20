package AWT.calculator;

import javax.swing.*;

public class MiniPainel {
    static private int width, height, PosXPainel, PosYPainel;
    static public JTextField MiniVisor = new JTextField();

    public static void setSizeMiniVisor(){
        width = 115;
        height = 15;
        MiniVisor.setSize(width, height);
    }

    public static void setLocationMiniVisor(){
        PosXPainel = 10;
        PosYPainel = 5;
        MiniVisor.setLocation(PosXPainel, PosYPainel);
    }
}
