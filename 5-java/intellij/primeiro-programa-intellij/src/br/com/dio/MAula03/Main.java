package br.com.dio.MAula03;

public class Main {

    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercício quadrilátero \n");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaReatangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do quadrado: " + areaReatangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do quadrado: " + areaTrapezio);

    }


}

