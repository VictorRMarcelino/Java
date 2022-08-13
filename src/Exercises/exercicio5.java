package Exercises;

public class exercicio5 extends exercicio1{
    /*
    Faça um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual. Calcule e
    mostre:
    a)A idade dessa pessoa.
    b)Quantos anos essa pessoa terá em 2037
     */

    public static int anoNascimento, anoAtual, idadePessoa, idadeEm2037;

    public static void main(String[] args) {
        insereAnoNascimento();
    }

    public static void insereAnoNascimento() {
        java.lang.System.out.println("Insira seu ano de nascimento");
        anoNascimento = scanner.nextInt();
        insereAnoAtual();
    }

    public static void insereAnoAtual() {
        java.lang.System.out.println("Insira o ano atual");
        anoAtual = scanner.nextInt();
        calculaIdadeAtual();
    }

    public static void calculaIdadeAtual() {
        idadePessoa = anoAtual - anoNascimento;
        calculaIdadeEm2037();
    }

    public static void calculaIdadeEm2037() {
        idadeEm2037 = 2037 - anoNascimento;
        printaValores();
    }

    public static void printaValores() {
        java.lang.System.out.println("Ano Nascimento: " + anoNascimento);
        java.lang.System.out.println("Ano Atual: " + anoAtual);
        java.lang.System.out.println("Idade Atual: " + idadePessoa);
        java.lang.System.out.println("Idade em 2037: " + idadeEm2037);
    }
}
