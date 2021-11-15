package Arquivos.Exercicios.Aluno;

public class MainProva {
    public static void main(String[] args) {
        Aluno p1 = new Aluno();
        p1.setProntuario("sp010101");
        System.out.println (p1.getProntuario());

        Aluno n2 = new Aluno();
        n2.setNome ("Jo Li");
        System.out.println (n2.getNome());
    }
}

