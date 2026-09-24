package anotacoes.javacore.Jmodificadorfinal.teste;

import anotacoes.javacore.Jmodificadorfinal.dominio.Carro;
import anotacoes.javacore.Jmodificadorfinal.dominio.Comprador;
import anotacoes.javacore.Jmodificadorfinal.dominio.Porsche;

public class CarroTeste01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        // Acesso à constante estática diretamente pelo nome da classe.
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        // MODIFICANDO O ESTADO DO OBJETO FINAL:
        // A variável COMPRADOR é 'final' e não aceita um novo "new Comprador()",
        // mas é perfeitamente legal chamar métodos que alteram seus dados internos (como setNome).
        carro.COMPRADOR.setNome("Kauan");
        System.out.println(carro.COMPRADOR);

        Porsche porsche = new Porsche();
        porsche.setNome("GT3 RS");

        // O metodo imprime() foi herdado e pode ser chamado normalmente,
        // apenas a sua sobrescrita lá na classe Porsche é que foi bloqueada pelo 'final'.
        porsche.imprime();
    }
}
