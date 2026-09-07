package anotacoes.orientacaoaobjetos.metodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        // 'estudante' recebeu o endereço do objeto original criado no main.
        System.out.println("\n-------------------------------\n");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        /*
            ATENÇÃO: Aqui você usou a referência para entrar no objeto original e mudar seu campo!
           Qualquer um que aponte para este mesmo objeto verá o nome "Letícia".
         */
        estudante.nome = "Letícia";
    }
}
