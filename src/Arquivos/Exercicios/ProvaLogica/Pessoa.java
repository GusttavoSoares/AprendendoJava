package Arquivos.Exercicios.ProvaLogica;

public class Pessoa {
    protected String prontuario;
    protected String nome;
    protected Projeto projeto;

    public Pessoa(String prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.projeto = projeto;
    }

        public String getProntuario(){
            return this.prontuario;
        }
        public String getNome(){
            return this.nome;
        }
        public Projeto getProjeto(){
            return this.projeto;
        }
    }

