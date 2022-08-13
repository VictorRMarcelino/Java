package Exercises;

public class exercicio4 extends exercicio3{
    /*Faça um algoritmo que receba um número positivo e maior que zero, calcule e mostre
    a)O número digitado ao quadrado.
    b)O número digitado ao cubo.
    c)A raiz quadrada do número digitado.
    d)A raiz cúbica do número digitado.
     */


    public static double valor, valorElevadoAoQuadrado, valorElevadoAoCubo, raizValorAoQuadrado , raizValorAoCubo;

    public static void main(String[] args) {
        insiraValor();
    }

    public static void insiraValor() {
        java.lang.System.out.println("Insira seu valor");
        valor = scanner.nextDouble();
        verificaValor();
    }

    public static void verificaValor(){
        if(valor > 0){
            calculaValorAoQuadrada();
        }else if(valor < 0){
            java.lang.System.out.println("Insira um valor maior que 0");
            insiraValor();
        }
    }

    public static void calculaValorAoQuadrada() {
        valorElevadoAoQuadrado = valor * valor;
        calculaValorAoCubo();
    }

    public static void calculaValorAoCubo() {
        valorElevadoAoCubo = valor * valor * valor;
        calculaRaizQuadrada();
    }

    public static void calculaRaizQuadrada() {
        raizValorAoQuadrado = Math.sqrt(valor);
        calculaRaizCubica();
    }

    public static void calculaRaizCubica() {
        raizValorAoCubo = Math.cbrt(valor);
        printaValores();
    }

    public static void printaValores(){
        java.lang.System.out.println("Valor elevado ao quadrado: " + valorElevadoAoQuadrado);
        java.lang.System.out.println("Valor elevado ao cubo: " + valorElevadoAoCubo);
        java.lang.System.out.println("Raiz quadrada: " + raizValorAoQuadrado);
        java.lang.System.out.println("Raiz cubica: " + raizValorAoCubo);
    }
}
