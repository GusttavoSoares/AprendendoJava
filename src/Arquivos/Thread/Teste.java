/*
Código com base no vídeo do canal Loiane Groner: https://www.youtube.com/c/loianegroner
 */
package Arquivos.Thread;

public class Teste {

    public static void main (String[] args){


        MinhaThread thread = new MinhaThread("Thread #1", 200);

        MinhaThread thread2 = new MinhaThread("Thread #2", 500);

        MinhaThread thread3 = new MinhaThread("Thread #3", 100);
    }
}
