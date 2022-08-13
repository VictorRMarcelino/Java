package Exercises;

public class exercicios {
    public static void main(String[] args){
        /* 1- Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
            A média dos números 4, 5 e 6.
            A soma das duas médias. A média das médias.

         */

        int n1[] = {8,9,7};
        int ma1 = 0;
        int n2[] = {4,5,6};
        int ma2 = 0;

        for(int i = 0; i < n1.length; i++){
            ma1 +=n1[i];
        }

        for(int i = 0; i < n1.length; i++){
            ma2 +=n2[i];
        }

        int maFinal = ma1/n1.length;
        int maFinal2 = ma2/n2.length;
        int somaMedias = maFinal + maFinal2;

        java.lang.System.out.println("Média A:" + maFinal);
        java.lang.System.out.println("Média B:" + maFinal2);
        java.lang.System.out.println("Média Total:" + somaMedias);

    }
}
