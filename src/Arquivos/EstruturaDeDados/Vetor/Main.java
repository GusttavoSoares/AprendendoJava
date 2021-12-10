package Arquivos.EstruturaDeDados.Vetor;

public class Main {
    public static void main (String[] args){
        VetorInt vetorInt = new VetorInt(2);
        Vetor vetorString = new Vetor (1);

        System.out.println("Testando a classe de vetores do tipo inteiro");
        vetorInt.adicionar(7);
        vetorInt.adicionar(9);
        System.out.println(vetorInt.tamanho());
        vetorInt.adicionar(5);
        System.out.println(vetorInt.tamanho());

        System.out.println(vetorInt.buscarElemento(9));
        System.out.println(vetorInt.buscarPosicao(2));

        vetorInt.remover(2);
        //System.out.println(vetorInt.buscarPosicao(2));
        vetorInt.adicionar(0,3);
        System.out.println(vetorInt.buscarElemento(3));

        System.out.println("Testando a classe de vetores do tipo String");
        vetorString.adicionar("Gustavo");
        System.out.println(vetorString.tamanho());

        System.out.println(vetorString.buscarElemento("Gustavo"));
        System.out.println(vetorString.buscarPosicao(0));

        vetorString.adicionar("Santos");
        System.out.println(vetorString.tamanho());

        System.out.println(vetorString.buscarElemento("Santos"));
        System.out.println(vetorString.buscarPosicao(1));

        vetorString.remover(0);
        System.out.println(vetorString.buscarPosicao(0));


        vetorString.adicionar(1,"Costa");
        System.out.println(vetorString.buscarElemento("Costa"));
    }
}
