package Exercises;

public class exercicio6 extends exercicio1{
    /*
     O custo ao consumidor de um carro novo é a soma do preço de fábrica com o percentual de lucro
    do distribuidor e dos impostos aplicados ao preço de fábrica. Faça um algoritmo que receba o preço
    de fábrica de um veículo, o percentual de lucro do distribuidor e o percentual de impostos. Calcule e
    mostre:
    a)O valor correspondente ao lucro do distribuidor
    b)O valor correspondente aos impostos.
    c)O preço final do veículo
     */

    public static double valorFabrica, percentualLucroDistribuidor,
    percentualImpostos, valorLucroConsumidor, valorImpostos, valorFinal;

    public static void main(String[] args) {
        insereValorPrecoFabrica();
    }

    public static void insereValorPrecoFabrica(){
        java.lang.System.out.println("Insira o preço de fábrica");
        valorFabrica = scanner.nextDouble();
        inserePercentualLucroDistribuidor();
    }

    public static void inserePercentualLucroDistribuidor(){
        java.lang.System.out.println("Insira o preço de fábrica 'Obs: O valor será considerado em porcentagem'");
        percentualLucroDistribuidor = scanner.nextDouble();
        inserePercentualImpostos();
    }

    public static void inserePercentualImpostos(){
        java.lang.System.out.println("Insira o preço de fábrica 'Obs: O valor será considerado em porcentagem'");
        percentualImpostos = scanner.nextDouble();
        calculaValorConsumidor();
    }

    public static void calculaValorConsumidor(){
        valorLucroConsumidor = valorFabrica * (valorLucroConsumidor/100);
        calculaValorImpostos();
    }

    public static void calculaValorImpostos(){
        valorImpostos = valorFabrica * (percentualImpostos/100);
        calculaPrecoFinal();
    }

    public static void calculaPrecoFinal(){
        valorFinal = valorFabrica + valorLucroConsumidor + valorImpostos;
        printaValores();
    }

    public static void printaValores(){
        java.lang.System.out.println("Lucro Distribuidor: " + valorFinal);
        java.lang.System.out.println("Valor impostos: " + valorFinal);
        java.lang.System.out.println("Valor Final: " + valorFinal);
    }

}
