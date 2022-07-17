package br.com.dio.OOAula03;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCapacidadeTanque(50);
        carro.setModelo("Hb20");

        System.out.println("O valor para encher o tanque de " + carro.getCapacidadeTanque() +"L da " + carro.getModelo() + " é: R$" + carro.totalValorTanque(5.50));
    }
}
