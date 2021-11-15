/* Uma String pode ser modificada depois de criada? Sim ou não é o motivo. //
          String é imutável. O que isso significa?
          Fontes: https://www.ti-enxame.com/pt/java/string-e-imutavel.-qual-e-exatamente-o-significado/940881003/
          Resposta: String não pode ser modificada depos de criada
*/

package Arquivos.Perguntas.Primeira;

public class StringImutavel {
    public static void main (String args[]){
       String teste = "cinco";
       System.out.println ("Primeiro resultado: " +teste);

       /* Nessa nova atribuição o que acontece na verdade é a criação de uma nova String
       Quando atribui o valor setee, a maquina virtual tenta mudar o valor de cinco para setee, mas
       como as strings são imutaveis o VM não pode alterar, então ela cria um novo objeto String com o novo
       valor, nesse caso o valor "setee"
       E o que acontece com a String anterior já que foi criado um objeto? Bom ela foi perdida e vai para
       o pool constante String onde é feito um uso eficiente da memória

       Sempre que se cria uma nova referencia ( uma alteração), significa que um novo local de memória.
            http://prntscr.com/1ihw736
            http://prntscr.com/1ihwhum

            O endereço muda.

            O que acontece com int:
            http://prntscr.com/1ihxkrk
            http://prntscr.com/1ihxpym

            O endereço continua o mesmo.
        */
       teste = "setee";
       System.out.println ("Segundo resultado: " +teste);
       System.out.println ("");

       /* Saída:
        Primeiro resultado: primeiro
        Segundo resultado: segundo
        Logo o resultado mudou, então string não é imutável?
        */

    }
}
