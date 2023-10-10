package org.inf;

public class Endereco {

    private final String rua;
    private final String setor;
    private final String cep;
    private final String numero;
    private final String cidade;
    private final String estado;
    private final String bloco;

    private final String quadra;

    public Endereco(String rua, String setor, String cep, String numero, String cidade, String estado, String bloco, String quadra) {
        this.rua = rua;
        this.setor = setor;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.bloco = bloco;
        this.quadra = quadra;
    }

    public String getRua() {
        return rua;
    }

    public String getSetor() {
        return setor;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getBloco() {
        return bloco;
    }

    public String getQuadra() {
        return quadra;
    }

}
