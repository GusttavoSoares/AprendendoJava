package Arquivos.Exercicios.ClasseAssociativa;

public class Papel {
    private String nomePapel;
    private Ator ator;
    private Filme filme;

    public Papel(Ator ator, Filme filme, String nomePapel){
        this.ator = ator;
        this.filme = filme;
        this.nomePapel = nomePapel;
    }

    public Ator getAtor(){
        return this.ator;
    }
    public Filme getFilme(){
        return this.filme;
    }
    public  String getNomePapel(){
        return this.nomePapel;
    }
}
