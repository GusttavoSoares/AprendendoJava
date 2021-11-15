package Arquivos.Exercicios.ClasseAssociativa;

import java.util.List;
import java.util.ArrayList;

public class Ator {
    private String nomeAtor;
    private List<Papel> papeis;

    public Ator(String nomeAtor){
        this.nomeAtor = nomeAtor;
        this.papeis = new ArrayList<>();
    }

    public void addPapel (Papel papel){
        this.papeis.add(papel);
    }

    public String getNomeAtor(){
        return this.nomeAtor;
    }

    public List<Papel> getPapeis(){
        return this.papeis;
    }
}
