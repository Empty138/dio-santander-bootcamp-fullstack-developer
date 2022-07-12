package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        System.out.print("Aleatorios: ");

        for(int count = 0; count < numerosAleatorios.length; count++){
            int numero = random.nextInt(100);
            numerosAleatorios[count] = numero;
            System.out.print(" " + numerosAleatorios[count]);
        }

        System.out.print("\nSucessores: ");
        for (int numero : numerosAleatorios ) {
            System.out.print(" " + (numero+1));
        }
    }
}
