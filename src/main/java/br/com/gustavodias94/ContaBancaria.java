package br.com.gustavodias94;

public class ContaBancaria {

    private Double saldo;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }


    public void sacar(Double valor){
        this.saldo -= valor;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
