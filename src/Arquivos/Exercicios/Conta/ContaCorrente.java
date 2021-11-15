package Arquivos.Exercicios.Conta;

import java.time.LocalDate;

public class ContaCorrente extends Conta{
    private double limite;


    public ContaCorrente (int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, double limite)
    {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.limite = limite;
    }

//    public double getLimite(){
//        return limite;
//    }
//
//    @Override
//    public double calcularTarifa(){
//        return super.calcularTarifa();
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
//    } NÃO PRECISA -OS METODOS SÃO HERDADOS DA CLASSE MÃE
}

