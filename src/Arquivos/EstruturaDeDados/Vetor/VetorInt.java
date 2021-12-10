package Arquivos.EstruturaDeDados.Vetor;

public class VetorInt implements VetorIntInterface {
    private int[] elementos;
    private int tamanho;

    public VetorInt(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    @Override
    public void adicionar(int posicao, int elemento) {
        verificar(posicao);
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }


    @Override
    public void adicionar(int elemento) {
        aumentarCapacidade();
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }


    @Override
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public int buscarPosicao(int posicao) {
        verificar(posicao);
        return this.elementos[posicao];
    }

    @Override
    public int buscarElemento(int elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i] == elemento) {
                return i;
            }
        }
        return -1;
    }


    private void aumentarCapacidade() {
        if (this.tamanho == this.elementos.length) {
            int[] elementosNovos = new int[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    private void verificar(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new RuntimeException("Argumento invalido");
        }
    }

    @Override
    public void remover(int posicao) {
        verificar(posicao);
        if (tamanho - 1 - posicao >= 0)
            for (int i = posicao; i < tamanho - 1; i++) {
                this.elementos[i] = this.elementos[i + 1];
            }
        this.tamanho--;
    }
}

