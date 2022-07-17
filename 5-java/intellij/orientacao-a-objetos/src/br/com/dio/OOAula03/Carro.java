package br.com.dio.OOAula03;

import org.w3c.dom.ls.LSOutput;

class Carro {

    String modelo;
    int capacidadeTanque;
    Carro(){

    }

    Carro(int capacidadeTanque, String modelo){
        this.capacidadeTanque = capacidadeTanque;
        this.modelo = modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
