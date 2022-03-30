package Arquivos.Object.Equals;

public class MetodoEquals {
    public static void main (String[] args) {
        Integer i = 10;
        Integer j = 20;

        System.out.println(i.equals(j));

        String a = "a";
        String b = "b";

        System.out.println(a.equals(b));
    }
}



/* Equals compara se dois objetos são iguais ou diferentes
   Para utilizar esse método é necessário sobreescrever o método
   equals da Classe object.
 */