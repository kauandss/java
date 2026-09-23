package anotacoes.javacore.Hheranca.teste;

import anotacoes.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    // Regra de ouro da Herança: O PAI sempre nasce antes do FILHO.
    // Por isso os blocos estáticos, de instância e o construtor da Superclasse (Pessoa)
    // executam primeiro que os da Subclasse (Funcionario).

    // 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai;
    // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha;
    // 2 - Alocado espaço em memória pro objeto da superclasse pai;
    // 3 - Cada atributo de superclasse pai é criado e inicializado com valores default ou o que for passado;
    // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece;
    // 5 - Construtor da superclasse é executado;

    // 6 - Alocado espaço em memória pro objeto da subclasse filha;
    // 7 - Cada atributo de subclasse pai [filha] é criado e inicializado com valores default ou o que for passado;
    // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece;
    // 9 - Construtor da subclasse é executado.
    
    static void main(String[] args) {
        // Ao instanciar um Funcionario, toda a cascata de eventos numerados acima será disparada.
        Funcionario funcionario = new Funcionario("Kauan");
    }
}
