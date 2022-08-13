package Exercises;

public class exercicio3 extends exercicio1{
    // Faça um algoritmo que receba o salário-base de um funcionário, calcule e mostre o salário a
    //receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o salário base e paga
    //imposto de 7% sobre o salário base

    public static double salarioBase, gratificacao = 1.05, salarioGratificado, imposto = 0.07, salarioImposto, salarioFinal;

    public static void main(String[] args) {
        java.lang.System.out.println("Digite o sálário base do funcionário:");
        salarioBase = scanner.nextDouble();
        realizaCalculos();
    }

    public static void realizaCalculos() {
        salarioGratificado = salarioBase * gratificacao;
        salarioImposto = salarioBase * imposto;
        salarioFinal = salarioGratificado - salarioImposto;
        printaNaTelar();
    }

    public static void printaNaTelar() {
        java.lang.System.out.println("salario gratificado " + salarioGratificado);
        java.lang.System.out.println("salario imposto " + salarioImposto);
        java.lang.System.out.println("salario final " + salarioFinal);
    }
}
