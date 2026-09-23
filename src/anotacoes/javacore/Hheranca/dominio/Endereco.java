package anotacoes.javacore.Hheranca.dominio;

public class Endereco {
    // Modificador 'private' garante o encapsulamento.
    // Classes externas só acessam esses dados via Getters e Setters.
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
