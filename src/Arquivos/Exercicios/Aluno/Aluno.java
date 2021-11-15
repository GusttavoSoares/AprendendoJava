package Arquivos.Exercicios.Aluno;

public class Aluno {
    private String prontuario;
    private String nome;

    public Aluno(){}
    public Aluno(String prontuario, String nome){
        this.setProntuario(prontuario);
        this.setNome(nome);
    }

    public void setProntuario(String prontuario){
        if (prontuario.toLowerCase().startsWith("sp") && prontuario.length() == 8)
            this.prontuario = prontuario;
        else
            throw new IllegalArgumentException ("Prontuario invalido");
    }


    public String getProntuario (){
        return prontuario;
    }

    public void setNome(String nome){
        nome = nome.trim();
        if (nome.length() >=5 && nome.length() <=100)
            this.nome = nome;

        else
            throw new IllegalArgumentException ("Nome invalido");

    }

    public String getNome (){
        return nome;
    }

}
