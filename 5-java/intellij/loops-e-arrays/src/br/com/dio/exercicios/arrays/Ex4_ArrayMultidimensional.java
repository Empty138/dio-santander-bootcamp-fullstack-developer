package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];

        System.out.println("Matriz: ");

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz [i][j] = random.nextInt(9);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
