package br.com.dio.MAula03;

public class Quadrilatero {

        public static double area(double lado){

            return lado * lado;
        }

        public static double area(double lado1, double lado2){

           return lado1 * lado2;
        }

        public static double area(double baseMaior, double baseMenor, double altura){

            return (( baseMaior + baseMenor ) * altura) / altura;
        }

/*      public static void xpto() {

            System.out.println("Antes");
            return;
       }

            public static long abc() {
            return 1.6;
      }
*/
}

