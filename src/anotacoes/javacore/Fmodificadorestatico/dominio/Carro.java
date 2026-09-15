package anotacoes.javacore.Fmodificadorestatico.dominio;

public class Carro {
    // Atributos de instância: cada carro terá os seus próprios valores
    private String marca;
    private double velocidadeMaxima;

    // Atributo estático: pertence à classe. TODOS os carros compartilham este único valor
    private static double velocidadeLimite = 250;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------");
        System.out.println("Nome: "+ this.marca); // Acessa o valor deste objeto
        System.out.println("Velocidade Máxima: "+ this.velocidadeMaxima); // Acessa o valor deste objeto

        // Acessa o valor da classe. Usamos 'Carro.nomeDoAtributo' em vez de 'this' como boa prática
        System.out.println("Velocidade Limite: "+ Carro.velocidadeLimite);
    }

    // Mét0do estático: usado para alterar o atributo estático.
    // Afeta todos os carros instanciados de uma só vez.
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    // Mét0do estático: retorna o valor do atributo da classe
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    // ... (Os demais getters e setters continuam iguais, eles lidam apenas com a instância)

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
