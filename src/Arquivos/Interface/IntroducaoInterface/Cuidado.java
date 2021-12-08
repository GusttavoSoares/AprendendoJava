package Arquivos.Interface.IntroducaoInterface;

import javax.swing.JOptionPane;

public class Cuidado implements Alerta {

    public void showMsg(String texto, int icone) {
        //exibir uma mensagem
        JOptionPane.showMessageDialog(null, texto, "Mensagem", icone);
    }

    public void showMsg(String texto) {
        //exibir uma mensagem
        JOptionPane.showMessageDialog(null, texto, "Mensagem", 1);
    }

    public static void main(String args[]) {
        // não precisa criar atributo

        //instanciar Cuidado
        Cuidado objetoCuidado = new Cuidado();

        // criado variáveis
        String st;
        int icone;

        // inserindo conteudo do atributo demora em st;
        // variável = objeto.atributo
        st = objetoCuidado.demora;

        // inserindo um valor para icone
        icone = 2;

        //exibir o conteúdo
        //Está demorando com icone de exclamação
        objetoCuidado.showMsg(st, icone);

        //inserir o conteudo do Atributo cautela em st
        st = objetoCuidado.cautela;

        // exibir o conteudo
        objetoCuidado.showMsg(st, icone);
    }
}


