package Arquivos.EstruturaDeDados.Vetor;

public interface VetorInterface {
    public void adicionar(String elemento);

    public void adicionar(int posicao, String elemento);

    public void remover(int posicao);

    public String buscarPosicao(int posicao);

    public int buscarElemento(String elemento);

    public int tamanho();
}
