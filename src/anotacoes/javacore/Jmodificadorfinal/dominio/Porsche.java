package anotacoes.javacore.Jmodificadorfinal.dominio;

// A herança é permitida porque a classe Carro NÃO tem o modificador 'final'.
public class Porsche extends Carro{
    // Tentar sobrescrever o metodo imprime() aqui resultaria em ERRO DE COMPILAÇÃO.
    // Exemplo do que é proibido:
    // @Override
    // public void imprime() {
    //     System.out.println("Imprimindo Porsche");
    // }
}
