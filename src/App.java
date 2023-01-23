import model.Conta;
import model.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        
        var conta = new Conta(0001);
        conta.deposito(500);
        conta.saque(100);
        conta.saque(100);
        
        conta.exibirSaldo();


        
    }
}
