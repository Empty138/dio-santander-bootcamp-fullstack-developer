package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N;
        int qtdN;
        int count = 0;
        int qntdPares=0, qntdImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        qtdN = scan.nextInt();

        do{
            System.out.println("Digite o número: ");
            N = scan.nextInt();
            count++;
            if (N % 2 == 0){
                qntdPares++;
            }else {
                qntdImpares++;
            }
        }while(count < qtdN);

        System.out.println("\nExiste " +qntdPares + " número(s) pare(s)");
        System.out.println("\nExiste " +qntdImpares + " número(s) ímpare(s)");
    }
}
