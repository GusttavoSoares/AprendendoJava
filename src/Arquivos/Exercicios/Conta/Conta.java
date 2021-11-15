package Arquivos.Exercicios.Conta;

import java.time.LocalDate;

public class Conta {
    private int numero;
    private LocalDate dataAbertura; // ninguém pode acessar (nem as sub) então precisa de get ou set
    protected double saldo; // protected: apenas subclasses
    protected double tarifa;
    private Correntista correntista; // Variavel com nome correntista do tipo Correntista

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
        this.correntista.addConta(this); // Assim que criar o objeto Conta ele vai se associar a classe Correntista
    }

//    public double getTarifa() {
//        return tarifa;
//    } - Testando se no main consigo acessar a variavel por meio de Conta.tarifa;

    public int getNumero() {
        return numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

//    public double getSaldo() {
//        return saldo;
//    } Testando se no main consigo acessar a variavel por meio de Conta.saldo;


    public Correntista getCorrentista() {
        return correntista;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

    public double calcularTarifa() {
        return this.tarifa;
    } // talvez não seja necessário


}

/* DÚVIDAS
É NECESSÁRIO MESMO O MÉTODO calcularTarifa() ? Pois a variavel tarifa está protected, logo posso acessa-la usando Conta.tarifa
Tem algum que tenha perfomance melhor?
 */