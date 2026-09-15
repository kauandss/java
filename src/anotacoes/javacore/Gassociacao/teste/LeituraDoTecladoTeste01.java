package anotacoes.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite 'M' ou 'F' para o seu sexo: ");
        char sexo = entrada.next().charAt(0);

        System.out.println("----------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }

}
