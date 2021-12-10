package Arquivos.EstruturaDeDados.Vetor;

public interface VetorIntInterface {
    public void adicionar(int elementos);

    public void adicionar(int posicao, int elemento);

    public void remover(int posicao);

    public int buscarPosicao(int posicao);

    public int buscarElemento(int elemento);

    public int tamanho();
}
