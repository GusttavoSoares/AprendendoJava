package Arquivos.Object.Hashcode;

public class Hashcode {
    public static void main (String[] args){
        Comida c1 = new Comida("carne");

        Comida c2 = new Comida ("grãos");

        Comida c3 = new Comida ("frutas");

        System.out.println("c1: " + c1.hashCode());

        System.out.println("c2: " + c2.hashCode());

        System.out.println("c3: " + c3.hashCode());
    }
}


/*
Método que retorna um código hash do objeto;

classe Object tem a versão básica do método hashcode;

utilizada para agilizar buscas por objetos em vetores do tipo collections;

retorna número inteiro gerado a partir dos valores armazenados nos atributos
dos objetos;

classe String e Wrapper sobrescrevem hashcode(), para que dois objetos distintos
com atributos iguais retornem o mesmo número hashcode;

 */