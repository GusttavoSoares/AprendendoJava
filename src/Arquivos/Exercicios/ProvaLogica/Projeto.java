package Arquivos.Exercicios.ProvaLogica;

import java.util.List;
import java.util.ArrayList;

public class Projeto {
    private String titulo;
    private boolean ativo;
    private Curso curso;
    private List<Pessoa> participantes;

    public Projeto(String titulo, boolean ativo, Curso curso) {
        this.titulo = titulo;
        this.ativo = ativo;
        this.curso = curso;
        this.participantes = new ArrayList<>();

    }

    public String getTitulo() {
        return this.titulo;
    }


    public boolean getAtivo() {
        return this.ativo;
    }

    void adicionarParticipante(Pessoa pessoa) {
        try {
            if (this.ativo) {
                this.participantes.add(pessoa);
            } else {
                throw new Exception("Não é possível adicionar participante em um projeto não ativo");
            }
            } catch(Exception e) {
            System.out.println("Não é possível adicionar participante em um projeto não ativo");
        }
    }


    public int getNumeroParticipantes() {
        int soma= 0;
        for (int i=0 ; i<participantes.size(); i++){
            soma = i+soma;
        }
        return soma;

    }

}
