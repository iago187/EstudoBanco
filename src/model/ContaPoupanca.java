package model;

public class ContaPoupanca extends Conta {

    private double taxa;
    
    public ContaPoupanca(int numero) {
        super(numero);        
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    
}
