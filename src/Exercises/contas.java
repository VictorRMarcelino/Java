package Exercises;

import java.util.Scanner;

public class contas {
    public static int n1;
    public static int n2;
    public static int Metodo;
    public static void main(String[] args){
        Scanner sc = new Scanner(java.lang.System.in);
        java.lang.System.out.println("Insira o primeiro número");
        n1 = sc.nextInt();
        java.lang.System.out.println("Insira o segundo número");
        n2 = sc.nextInt();
        java.lang.System.out.println("Escolha o método de conta");
        java.lang.System.out.println("1: Soma");
        java.lang.System.out.println("2: Subtração");
        java.lang.System.out.println("3: Multiplicação");
        java.lang.System.out.println("4: Divisão");
        Metodo = sc.nextInt();
        switch (Metodo){
            case 1 ->{
                int Conta = n1 + n2;
                java.lang.System.out.println("Resultado: " + Conta);
            }
            case 2 ->{
                int Conta = n1 - n2;
                java.lang.System.out.println("Resultado: " + Conta);
            }
            case 3 ->{
                int Conta = n1 * n2;
                java.lang.System.out.println("Resultado: " + Conta);
            }
            case 4 ->{
                int Conta = n1 / n2;
                java.lang.System.out.println("Resultado: " + Conta);
            }default ->{
                java.lang.System.out.println("Opção escolhida é inválida");
            }
        }

    }
}
