package Arquivos.Interface.Comida;

public abstract class Alimento {

    private String nome;
    private int dataProducao;

    public int getFabricacao() {
        return dataProducao;
    }

    public void setFabricacao(int fabricacao) {
        this.dataProducao = dataProducao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
