package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o número a ser gerado a tabuada: ");
        int numero = scan.nextInt();

        System.out.println("Tabuada de: " + numero + "\n");

        for(int count = 0; count <= 10; count++){
            System.out.println(numero + "x" + count + "=" + (numero*count));
        }
    }
}
