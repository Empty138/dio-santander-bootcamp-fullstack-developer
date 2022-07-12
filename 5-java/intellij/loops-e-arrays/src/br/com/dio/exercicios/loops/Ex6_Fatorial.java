package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número para calcular o Fatorial: ");
        int fatorial = scan.nextInt();
        int resultado = 1;

        for(int count = fatorial; count >= 1; count--){
            resultado = resultado * count;
        }
        System.out.println("O resultado de " + fatorial + "!" + " é: "  + resultado );
    }
}
