package Arquivos.Exercicios.Conta;

import java.time.LocalDate;

public class ContaSalario extends Conta {
    private Empresa empresa;


    public ContaSalario(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, Empresa empresa) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.empresa = empresa;
    }

    public Empresa getEmpresa(){
        return empresa;
    }

//    @Override
//    public double calcularTarifa() {
//        return super.calcularTarifa();
//    }
//
//    @Override
//    public void sacar(double valor) {
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
//    } NÃO PRECISA, OS MÉTODOS JÁ SÃO HERDADOS DA CLASSE MÃE
}

