package Arquivos.Exercicios.ProvaLogica;

public class Aluno extends Pessoa{
    private Boolean matriculado;

    public Aluno(String prontuario, String nome, Boolean matriculado) {
        super(prontuario, nome);
        matriculado = true;
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
    }

