package anotacoes.javacore.Fmodificadorestatico.teste;

import anotacoes.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTeste {
    static void main(String[] args) {

        // Alteramos o valor na CLASSE antes mesmo de criar qualquer objeto.
        // O limite global agora é 180.
        Carro.setVelocidadeLimite(180);

        // Criamos 3 carros distintos. Cada um tem sua própria marca e velocidade máxima.
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Porsche", 290);

        // Ao imprimir, os dados individuais (marca/vel. max) serão diferentes para cada um,
        // mas a "Velocidade Limite" impressa será 180 para todos eles, pois compartilham o atributo estático.
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
