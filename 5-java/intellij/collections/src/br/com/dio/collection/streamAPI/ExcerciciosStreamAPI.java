package br.com.dio.collection.streamAPI;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExcerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        /*System.out.println("Imprime todos os elementos dessa lista de String: ");
          numerosAleatorios.forEach(System.out::println);
        */

        /*System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        */

        /*System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        */

        /*List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);
        */

        /*System.out.println("Mostre a média dos números: ");

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        */

        System.out.println("Remova os valores impares: ");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);
    }

}





