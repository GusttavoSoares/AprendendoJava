package Arquivos.Exercicios.ClasseAssociativa;

import java.util.List;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;

    public Filme (String titulo, int ano){
        this.titulo = titulo;
        this.ano = ano;
        this.papeis = new ArrayList<>();
    }
    public void addPapel(Ator ator, Filme filme, String nomePapel){
        Papel papel = new Papel (ator, filme, nomePapel);
        this.papeis.add(papel);
        ator.addPapel(papel);
    }

    public List<Papel> getPapeis(){
        return this.papeis;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }



}
