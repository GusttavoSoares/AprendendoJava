package Arquivos.Exercicios.Conta;

import java.util.List;
import java.util.ArrayList;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas; // correntista pode ter várias contas

    public Correntista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = new ArrayList<>(); // é igual a this.contas = new ArrayList<Conta>()
        // como ele está vendo que é uma lista de Conta, não precisa colocar.
        // variavel conta do Tipo Conta é um novo objeto de ArrayList
    }

    public double totalTarifa() {
        double soma = 0;
        for (int i = 0; i < contas.size(); i++) { // da para criar um foreach
            soma = soma + contas.get(i).tarifa;
        }
        return soma;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);

    }
}
/* Array list permite criar array com tamanho "indeterminado"
Os elementos do array pode ser retirado ou adicionado */

/*
DÚVIDAS
O que o método get(i) faz?

 */