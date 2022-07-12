package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("Digte uma nota de 0 a 10: ");
        nota = scan.nextDouble();

        while(nota < 0 | nota > 10) {
            System.out.println("Valor inválido! Digite novamente: ");
            nota = scan.nextDouble();
        }
        System.out.println("A nota é: " + nota);
    }
}
