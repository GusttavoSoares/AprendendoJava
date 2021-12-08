package Arquivos.Interface.IntroducaoInterface;

import javax.swing.JOptionPane;

public class Sucesso implements Mensagem {
    public void showMsg(String texto) {
        //exibir uma mensagem
        JOptionPane.showMessageDialog(null, texto, "Mensagem", 1);
    }

    public static void main(String args[]) {
        // não precisa criar atributo

        //instanciar Sucesso
        Sucesso objetoSucesso = new Sucesso();

        // criado variável
        String st;

        // inserindo conteudo do atributo bemVindo em st
        // variável = objeto.atributo;
        st = objetoSucesso.bemVindo;

        //exibir o conteúdo
        //Olá, Seja Bem vindo!!!
        objetoSucesso.showMsg(st);

        //inserir o conteudo do atributo sucesso em st
        st = objetoSucesso.sucesso;

        // exibir o conteudo
        objetoSucesso.showMsg(st);
    }
}