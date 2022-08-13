package Exercises;

public class exercicio7 extends exercicio1{
    /*
    Faça um algoritmo que receba o número de horas trabalhadas e o valor do salário mínimo. Calcule
    e mostre o salário a receber seguindo as regras abaixo:
    a)A hora trabalhada vale a metade do salário mínimo;
    b)O salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora
    trabalhada.
    c)O imposto equivale a 3% do salário bruto.
    d)O salário a receber equivale ao salário bruto menos o imposto
     */

    public static double horasTrabalhada, salarioMinimo,
    valorHoraTrabalhada, salarioBruto,
    valorImposto, SalarioAReceber;

    public static void main(String[] args) {
        insereHorasTrabalhadas();
    }

    public static void insereHorasTrabalhadas() {
        java.lang.System.out.println("Insira a quantidade de horas trabalhadas");
        horasTrabalhada = scanner.nextDouble();
        insereValorSalarioMinimo();
    }

    public static void insereValorSalarioMinimo() {
        java.lang.System.out.println("Insira o salário minimo");
        salarioMinimo = scanner.nextDouble();
        calculaSalarioComHoraTrabalhadaValendoMetade();
    }

    public static void calculaSalarioComHoraTrabalhadaValendoMetade() {
        valorHoraTrabalhada = salarioMinimo/2;
        calculaSalarioBruto();
    }

    public static void calculaSalarioBruto() {
        salarioBruto = horasTrabalhada * valorHoraTrabalhada;
        calculaImposto();
    }

    public static void calculaImposto() {
        valorImposto = salarioBruto * 0.03;
        calculaSalarioAReceber();
    }

    public static void calculaSalarioAReceber() {
        SalarioAReceber = salarioBruto - valorImposto;
        printaValoresNaTela();
    }

    public static void printaValoresNaTela() {
        java.lang.System.out.println("número horas trabalhadas: " + horasTrabalhada + " horas");
        java.lang.System.out.println("Valor salário mínimo: " + salarioMinimo + " Reais");
        java.lang.System.out.println("Valor por hora trabalhada: " + valorHoraTrabalhada + " Reais");
        java.lang.System.out.println("Valor salário bruto: " + salarioBruto + " Reais");
        java.lang.System.out.println("Valor imposto: " + valorImposto + " Reais");
        java.lang.System.out.println("Salário a receber: " + SalarioAReceber + " Reais");
    }

}
