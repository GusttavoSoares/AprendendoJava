package Arquivos.Object.Equals.Implementacao;

public class TesteEquals {
    public static void main (String[] args){

        Carro palio = new Carro ("Gol");

        Carro gol = new Carro("Palio");

        System.out.println(palio.equals( gol ));
    }
}
