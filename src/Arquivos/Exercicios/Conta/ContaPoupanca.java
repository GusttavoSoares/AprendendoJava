package Arquivos.Exercicios.Conta;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate aniversario;

    public ContaPoupanca (int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, LocalDate aniversario)
    {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.aniversario = aniversario;
    }


//    @Override
//    public double calcularTarifa(){
//        return super.calcularTarifa();
//    }
//    public LocalDate getAniversario(){
//        return aniversario;
//    }
//
//    @Override
//    public void sacar (double valor){
//        super.sacar(valor);
//    }
//
//    @Override
//    public double getTarifa() {
//        return super.getTarifa();
//    }
//
//    @Override
//    public int getNumero() {
//        return super.getNumero();
//    }
//
//    @Override
//    public LocalDate getDataAbertura() {
//        return super.getDataAbertura();
//    }
//
//    @Override
//    public double getSaldo() {
//        return super.getSaldo();
//    }
//
//    @Override
//    public Correntista getCorrentista() {
//        return super.getCorrentista();
//    } - NÃO PRECISA, OS MÉTODOS JÁ SÃO HERDADOS DA CLASSE MÃE

    }


