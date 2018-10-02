package br.com.gustavodias94;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaBancariaTest {

    private ContaBancaria conta;

    @Before
    public void prepararTeste(){
        this.conta = new ContaBancaria(1000.0);
    }

    @Test
    public void depositar(){
        conta.depositar(1000.0);
        Double saldo = conta.getSaldo();
        Assert.assertEquals(2000.0, saldo, 0.0);
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo disponível: " + saldo + "\n");
    }

    @Test
    public void sacar(){
        conta.sacar(500.0);
        Double saldo = conta.getSaldo();
        Assert.assertEquals(500.0, saldo, 0.0);
        System.out.println("Saque realizado com sucesso!");
        System.out.println("Saldo disponível: " + saldo);
    }


}
