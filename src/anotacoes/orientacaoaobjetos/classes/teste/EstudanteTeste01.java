package anotacoes.orientacaoaobjetos.classes.teste;
/*
    IMPORTAÇÃO: Como a classe Estudante está em outra pasta (pacote 'dominio'),
    precisamos avisar ao Java onde encontrá-la para poder usar o molde.
 */

import anotacoes.orientacaoaobjetos.classes.dominio.Estudante;

public class EstudanteTeste01 {

    // MÉT0DO MAIN: É o ponto de partida do programa. Onde a execução começa.
    static void main(String[] args) {

        /*
         * INSTANCIAÇÃO (Criando o objeto na memória)
         * Dividindo a linha em 3 partes fundamentais:
         * 1. Estudante estudante: Cria a "variável de referência" (como se fosse um controle remoto).
         * 2. = : Conecta o controle remoto à TV (o objeto real).
         * 3. new Estudante(): A palavra 'new' vai lá na memória RAM (Heap), constrói um
         *    objeto Estudante novinho em folha baseado no molde, e devolve o endereço dele.
         */

        Estudante estudante = new Estudante();

        /*
                INICIALIZAÇÃO DE ESTADO
            Usamos o operador PONTO (.) para acessar os atributos do objeto através da
            nossa variável de referência e dar valores a eles.
         */

        estudante.nome = "Kauan"; // Lê-se: "Acesse o 'nome' do objeto apontado por 'estudante' e guarde 'Kauan'".
        estudante.idade = 19;
        estudante.sexo = 'M';

        /*
                LENDO E IMPRIMINDO OS DADOS
            novamente usamos o PONTO (.) para ir até o objeto na memória, pegar os
            valores que acabamos de guardar e imprimi-los no console.
         */
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
