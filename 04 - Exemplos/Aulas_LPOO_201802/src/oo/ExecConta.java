package oo;

public class ExecConta {
    public static void main(String[] args) {
        
        Conta outraConta = new Conta(321, "Ciclano", 2000.00);
        
        System.out.println("O saldo da conta de "
                + outraConta.nomeCliente 
                + " é R$ " + outraConta.saldo);
        
    }
}
