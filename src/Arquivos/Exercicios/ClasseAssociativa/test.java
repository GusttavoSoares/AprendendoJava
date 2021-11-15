package Arquivos.Exercicios.ClasseAssociativa;

public class test {
    public static void main(String[] args) {
        Ator a1 = new Ator("Gustavo");
        Ator a2 = new Ator("João");
        Ator a3 = new Ator("Igor");
        Ator a4 = new Ator("Pedro");
        Ator a5 = new Ator("Ingrid");

        Filme f1 = new Filme("Os astronautas", 2005);
        Filme f2 = new Filme("Dory", 2018);

        Papel p1 = new Papel(a1, f1, "Astronauta G01");
        Papel p2 = new Papel(a2, f1, "Astronauta J01");
        Papel p3 = new Papel(a3, f2, "Peixe passaro");
        f1.addPapel(a4, f1, "Astrounauta P01");
        f1.addPapel(a4, f2, "Peixe sardinha");
        Papel p5 = new Papel(a5, f2, "Peixe salmão");

        System.out.println(f1.getAno());

        //System.out.println(a4.getNomeAtor());
        for (Papel papel : a4.getPapeis()) {
            System.out.println(papel.getNomePapel());
        }


    }
}
