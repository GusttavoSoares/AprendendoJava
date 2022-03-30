package Arquivos.Object.Hashcode;

public class ExemploHashcode {
    public static void main (String[] args){

        Integer i = 10;
        Integer j = 10;

        System.out.println("i: " + i.hashCode());
        System.out.println("j: " + i.hashCode());

        String a = "a";
        String b = "b";

        System.out.println("a: " + a.hashCode());
        System.out.println("b: " + b.hashCode());
    }
}
