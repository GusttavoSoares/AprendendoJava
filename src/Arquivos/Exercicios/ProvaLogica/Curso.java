package Arquivos.Exercicios.ProvaLogica;


import java.util.List;
import java.util.ArrayList;

public class Curso {
    private String nome;
    private String sigla;
    private List<Projeto> projetos;




    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.projetos = new ArrayList<>();
    }
        public void addProjeto (Projeto projeto){

        }
    public void adicionarProjeto(Projeto projeto) {
        this.projetos.add(projeto);
    }

    public int getNumeroProjetos() {
        int soma = 1;
        for (int i = 0; i <= projetos.size(); i++) {
            soma= soma+i;
        }
        return soma;
    }


    public List<Projeto> getProjetosAtivos() {
        return this.projetos;
    }


    public  int getNumeroProjetosAtivos() {
        int soma = 0;
        for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getAtivo()) {
                soma++;
            }
        }
        return soma;
    }
    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
    

