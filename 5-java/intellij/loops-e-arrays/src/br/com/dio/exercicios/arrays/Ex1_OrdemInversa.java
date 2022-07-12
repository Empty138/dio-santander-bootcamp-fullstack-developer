package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 15, 50, 8, 4};


        for(int i = 0; i <= (vetor.length-1) ; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Vetor Invertido:");
        for(int j = (vetor.length - 1); j >= 0; j-- ) {
            System.out.println(vetor[j]);
        }

    }
}

