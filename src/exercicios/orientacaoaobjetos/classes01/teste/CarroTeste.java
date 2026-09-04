package exercicios.orientacaoaobjetos.classes01.teste;

import exercicios.orientacaoaobjetos.classes01.dominio.Carro;

public class CarroTeste {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2010;

        carro2.nome = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2001;

        //carro1 = carro2;

        System.out.println("Carro: " + carro1.nome + " | " + carro1.modelo + " | " + carro1.ano);
        System.out.println("\nCarro 2: " + carro2.nome + " | " + carro2.modelo + " | " + carro2.ano);

    }
}
