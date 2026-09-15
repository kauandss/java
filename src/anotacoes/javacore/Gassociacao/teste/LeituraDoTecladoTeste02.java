package anotacoes.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro!!");
        System.out.println("Digite sua pergunta e eu responderei sim ou não: ");

        String pergunta = entrada.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else{
            System.out.println("NÃO");
        }



    }
}
