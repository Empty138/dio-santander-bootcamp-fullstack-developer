package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double media = 0d;
        int count = 0;

        do {
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();
            ++count;
            media += numero;

            if (numero > maior)
                maior = numero;

        }while(count < 5);
        System.out.println("O maior número é: " + maior);
        System.out.println("O média é: " + (media/count));
    }
}
