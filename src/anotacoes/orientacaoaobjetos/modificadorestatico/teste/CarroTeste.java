package anotacoes.orientacaoaobjetos.modificadorestatico.teste;

import anotacoes.orientacaoaobjetos.modificadorestatico.dominio.Carro;

public class CarroTeste {
    static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Porsche", 290);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);
        
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
