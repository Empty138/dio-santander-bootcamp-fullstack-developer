package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] caracteres = new String[6];
        int quantidadeCaracteres = 0;
        int count = 0;

       do{
           System.out.println("Digite o caracter:");
           String letra = scan.next();

            if( !(letra.equalsIgnoreCase( "a" )|
                    letra.equalsIgnoreCase( "e" )|
                    letra.equalsIgnoreCase( "i" )|
                    letra.equalsIgnoreCase( "o" )|
                    letra.equalsIgnoreCase( "u" ))){

                caracteres[count] = letra;
                quantidadeCaracteres++;
           }
            count++;

        }while(count < caracteres.length);

        System.out.print("Consoantes: ");
        for ( String consoante : caracteres ) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeCaracteres);
    }
}
