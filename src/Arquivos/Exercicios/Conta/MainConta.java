package Arquivos.Exercicios.Conta;

import java.time.LocalDate;

public class MainConta {
    public static void main(String[] args) {

        Correntista cr1 = new Correntista(20, "Paulo");
        ContaCorrente cc1 = new ContaCorrente(2, LocalDate.now(), 500, 5, cr1, 200);
        ContaPoupanca cp1 = new ContaPoupanca(5, LocalDate.now(), 250, 3, cr1, LocalDate.now());
        Empresa em1 = new Empresa("209120", "TOTVS");
        ContaSalario cs1 = new ContaSalario(7, LocalDate.now(), 1000, 0, cr1, em1);

        System.out.println(cr1.totalTarifa());
        System.out.println("teste");
    }
}