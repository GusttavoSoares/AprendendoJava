package Arquivos.Exercicios.ProvaLogica;

public class Professor extends Pessoa{
    private String formacao;

    public Professor(String prontuario, String nome, String formacao) {
        super(prontuario, nome);
        this.formacao = formacao;
    }
        @Override
        public String getProntuario(){
            return super.getProntuario();
        }

        @Override
        public String getNome(){
            return super.getNome();
        }

        @Override
        public Projeto getProjeto(){
            return super.getProjeto();
        }

        public String getFormacao(){
        return formacao;
        }
    }

