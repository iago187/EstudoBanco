package model;

public class ContaCorrente extends Conta{
    
    private int taxa;

    public ContaCorrente(int numero) {
        super(numero);
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }
    
}
