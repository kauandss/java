package anotacoes.javacore.Jmodificadorfinal.teste;

import anotacoes.javacore.Jmodificadorfinal.dominio.Carro;
import anotacoes.javacore.Jmodificadorfinal.dominio.Comprador;
import anotacoes.javacore.Jmodificadorfinal.dominio.Porsche;

public class CarroTeste01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Corolla");
        System.out.println(carro.COMPRADOR);

        Porsche porsche = new Porsche();
        porsche.setNome("GT3 RS");
        porsche.imprime();
    }
}
