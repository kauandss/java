package anotacoes.orientacaoaobjetos.classes.dominio;

/**
 *  CLASSE DE DOMÍNIO (O Molde)
 *  <p>Esta classe serve estritamente como um molde para criar objetos do tipo "Estudante" em outras partes do sistema. Ela representa um conceito do mundo real.</p>
 */

public class Estudante {
    /*
            ATRIBUTOS (Características / Estado do objeto)
        São as variáveis que definem o que t0do objeto "Estudante" VAI TER.
        Usamos 'public' para que outras partes do código consigam acessar e modificar esses dados.
     */
    public String nome = "default";
    public int idade;
    public char sexo;
}
