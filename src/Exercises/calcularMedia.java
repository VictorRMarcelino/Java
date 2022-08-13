package Exercises;
import java.util.*;

public class calcularMedia {
    public static double notaPeso4, notaPeso6, finalPeso4, finalPeso6;
    public static String escolha, materia;
    static Scanner sc = new Scanner(java.lang.System.in);

    List lista = new ArrayList();


    public static List<Double> listaNotasPeso4 = new ArrayList<>(Arrays.asList());

    public static List<Double> listaNotasPeso6 = new ArrayList<>(Arrays.asList());


    public static void main(String[] args) {
        materia();
    }

    public static void materia(){
        java.lang.System.out.println("Insira a matéria desejada");
        materia = sc.nextLine();
        desejaAdicionarNotaPeso4();
    }

    public static void desejaAdicionarNotaPeso4(){
        java.lang.System.out.println("Deseja inserir uma nota peso 4? (sim/nao)");
        escolha = sc.nextLine();
        switch (escolha){
            case "sim" -> {
                adicionaNotaPeso4();
            }
            case "nao" -> {
                desejaAdicionarNotaPeso6();
            }
            default -> {
                adicionarNovaNotaPeso4();
            }
        }
    }


    public static void adicionaNotaPeso4(){
        java.lang.System.out.println("Insira sua nota peso 4");
        notaPeso4 = sc.nextDouble();
        listaNotasPeso4.add(notaPeso4);
        adicionarNovaNotaPeso4();
    }

    public static void adicionarNovaNotaPeso4(){
        java.lang.System.out.println("Deseja inserir outra nota? (sim/nao)");
        escolha = sc.nextLine();
        switch (escolha){
            case "sim" -> {
                adicionaNotaPeso4();
            }
            case "nao" -> {
                desejaAdicionarNotaPeso6();
            }
            default -> {
                adicionarNovaNotaPeso4();
            }
        }
    }

    public static void desejaAdicionarNotaPeso6(){
        java.lang.System.out.println("Deseja inserir uma nota peso 6? (sim/nao)");
        escolha = sc.nextLine();
        switch (escolha){
            case "sim" -> {
                adicionaNotaPeso6();
            }
            case "nao" -> {
                calcularNotasPeso4();
            }
            default -> {
                adicionarNovaNotaPeso4();
            }
        }
    }

    public static void adicionaNotaPeso6() {
        java.lang.System.out.println("Insira sua primeira nota peso 6");
        notaPeso6 = sc.nextDouble();
        listaNotasPeso6.add(notaPeso6);
        adicionarNovaNotaPeso6();
    }

    public static void adicionarNovaNotaPeso6(){
        java.lang.System.out.println("Deseja inserir outra nota? (sim/nao)");
        escolha = sc.nextLine();
        switch (escolha){
            case "sim" -> {
                adicionaNotaPeso6();
            }
            case "nao" -> {
                calcularNotasPeso4();
            }
            default -> {
                adicionarNovaNotaPeso6();
            }
        }
    }

    public static void calcularNotasPeso4(){
        double sum = 0;
        if(listaNotasPeso4.size() > 0) {
            for (int i = 0; i < listaNotasPeso4.size(); i++) {
                sum += listaNotasPeso4.get(i);
            }
            finalPeso4 = (sum / listaNotasPeso4.size()) * 0.4;
            calcularNotasPeso6();
        }else{
            finalPeso4 = 0;
            calcularNotasPeso6();
        }
    }

    public static void calcularNotasPeso6(){
        double sum = 0;
        if(listaNotasPeso6.size() > 0) {
            for (int i = 0; i < listaNotasPeso6.size(); i++) {
                sum += listaNotasPeso6.get(i);
            }
            finalPeso6 = sum / listaNotasPeso6.size() * 0.6;
            mediaFinal();
        }else{
            finalPeso6 = 0;
            mediaFinal();
        }
    }
    public static void mediaFinal(){
            double notaMediaFinal = finalPeso4 + finalPeso6;
            java.lang.System.out.println("");
            java.lang.System.out.println("peso 4: " + finalPeso4);
            java.lang.System.out.println("peso 6: " + finalPeso6);
            java.lang.System.out.println("Sua média em " + materia + " é: " + notaMediaFinal);
    }
}
