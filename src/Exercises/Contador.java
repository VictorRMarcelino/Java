package Exercises;

import javax.swing.*;
import java.util.Scanner;

public class Contador {
    static int número = 0;
    static String numeroString = Integer.toString(número);

    public static void main(String[] args){
        JFrame tela = new JFrame();
        tela.setSize(400, 400);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);



        //Criação e adição jlabel
        JLabel numeroTela = new JLabel();
        numeroTela.setText(numeroString);
        tela.add(numeroTela);

        JButton start = new JButton();
        start.setText("Iniciar");
        tela.add(start);

        //visibilidade tela
        tela.setVisible(true);
        numeroTela.setLocation(150, 150);
        numeroTela.setSize(50, 50);
        start.setBounds(100, 200, 100, 100);
    }

    public void Iniciar(){

        
    }

}
