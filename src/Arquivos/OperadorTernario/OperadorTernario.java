package Arquivos.OperadorTernario;


/*
Operaodr ternário - ? é considerado uma contração do if/ um encolhimento do if

Sintaxe

variavel = expressão ? true  : false;

*/
public class OperadorTernario {
    public static void main (String args[]) {
        char a = 'a';
        char b = 'b';

        String result = (a>b ) ? "varA  e maior que varB" : "varB e maior que varA";
        System.out.println(result);

    }
}
