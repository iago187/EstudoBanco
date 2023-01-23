package model;

import javax.sound.sampled.SourceDataLine;

public class Conta {
    private int numero;
    private double saldo;


    public Conta(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double saque(double valor){
        double limite = 10000;
        if (saldo < valor){
            System.out.println("Saldo Insuficiente");
            System.out.println("Saldo: "+saldo);
            return -1;     
        }
        if (valor > limite){
            System.out.println("Limite Excedido");
            return -1;
        }
        if (valor <= saldo && valor <= limite){
            saldo -= valor; 
            System.out.println("Saque Realizado");
            System.out.println("Saldo Atual: "+ saldo);
        }

        return saldo;
    }

    public double deposito(double valor){
        saldo += valor;
        return saldo;
    }

    public void exibirSaldo(){
        System.out.println("Conta: "+numero+"\nSaldo: "+saldo);
    }
    



    
}
